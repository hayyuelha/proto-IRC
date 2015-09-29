package main.java.ProtoChatServer.ChatServer;

import java.util.List;

import main.java.io.grpc.chatservice.ChannelUser;
import main.java.io.grpc.chatservice.Message;
import main.java.io.grpc.chatservice.RetVal;
import main.java.io.grpc.chatservice.User;
import io.grpc.stub.StreamObserver;
import main.java.ProtoChatServer.ChatServer.App;

public class ChatHandler implements  main.java.io.grpc.chatservice.ChatServiceGrpc.ChatService{


	private RetVal _nick(User u) {
		UserServer user = new UserServer();
		if (u.getNick().equals("")) {
			int temp = App.users.getListUsers().size();
			user.setNick("user" + String.valueOf(temp));
		} else {
			user.setNick(u.getNick());
		}
		user.setClientKey(u.getClientKey());
		App.users.addUser(user);
//		System.out.println("Total users: " + App.users.getListUsers().size());
		RetVal r = RetVal.newBuilder().setRetval("Online as " + user.getNick()).build();
		return r;
	}
	
	private RetVal _join(ChannelUser cu) {
		ChannelServer c = new ChannelServer();
		if (cu.getChannelName().equals("")) {
			int temp = App.channels.getListChannels().size();
			c.setName("channel" + String.valueOf(temp));
		} else {
			c.setName(cu.getChannelName());
		}
		UserServer u = App.users.getUser(cu.getClientKey());
		if (!App.channels.isExist(c.getName())) {
			App.channels.addChannel(c);
		}
		c = App.channels.getChannel(c.getName());
		c.addMember(u);
		u.addChannel(c);
		
//		System.out.println("Total channels: " + App.channels.getListChannels().size()
//				+ "with nMember of currently added channel is " + c.getUsersCount());
		RetVal r = RetVal.newBuilder().setRetval("Join channel " + c.getName()).build();
		return r;
	}

	public void nick(User request, StreamObserver<RetVal> responseObserver) {
		responseObserver.onValue(_nick(request));
		responseObserver.onCompleted();
	}

	public void join(ChannelUser request,
			StreamObserver<RetVal> responseObserver) {
		responseObserver.onValue(_join(request));
		responseObserver.onCompleted();
	}

	public void leave(ChannelUser request,
			StreamObserver<RetVal> responseObserver) {
		responseObserver.onValue(_leave(request));
		responseObserver.onCompleted();
	}
	
	public RetVal _leave(ChannelUser cu) {
		UserServer user = App.users.getUser(cu.getClientKey());
		System.out.println(user.getNick() + ": /LEAVE " + cu.getChannelName());
		ChannelServer c;
		if (cu.getChannelName().isEmpty()) {
			return RetVal.newBuilder().setRetval("Channel name couldn't be empty").build();
		} else if (!App.channels.isExist(cu.getChannelName())) {
			return RetVal.newBuilder().setRetval("Channel not found").build();
		}
		
		c = App.channels.getChannel(cu.getChannelName());
		
		if (!user.isJoinChannel(c.getName())){
			return RetVal.newBuilder().setRetval("You're not registered as member of " + c.getName()).build();
		}
		System.out.println("NMember of the chennel " + c.getUsersCount());
		c.removeMember(user);
		user.removeChannel(c);
		System.out.println("After a member leaving " + c.getUsersCount());
		return RetVal.newBuilder().setRetval("Leaving channel " + c.getName()).build();
	}

	public void exit(User request, StreamObserver<RetVal> responseObserver) {
		responseObserver.onValue(_exit(request));
		responseObserver.onCompleted();		
	}
	
	public RetVal _exit(User u) {
		UserServer user = App.users.getUser(u.getClientKey());
		System.out.println(user.getNick() + ": /EXIT");
		App.channels.removeUser(user);
		App.users.removeUser(user);
		RetVal r = RetVal.newBuilder().setRetval("Going offline...").build();
		System.out.println("Total users: " + App.users.getListUsers().size());
		return r;
	}

	public void send(Message request, StreamObserver<RetVal> responseObserver) {
		responseObserver.onValue(_send(request));
		responseObserver.onCompleted();	
	}
	
	public RetVal _send(Message m) {
		UserServer user = App.users.getUser(m.getClientKey());
		if (m.getChannel().isEmpty()) {	//send to all user's channels
			user.addMessageToAllChannels(m);
		} else {
			ChannelServer c = App.channels.getChannel(
					m.getChannel());
			Message tempMsg = Message.newBuilder().setChannel(c.getName()).setClientKey(user.getNick())
					.setMessage(m.getMessage()).build();
			c.addMessage(tempMsg);
		}
		return RetVal.newBuilder().setRetval("Delivered!").build();
	}

	public void getMessages(User request,
			StreamObserver<Message> responseObserver) {
		UserServer user = App.users.getUser(request.getClientKey());
		List<Message> m = user.getMessage();
		for (Message msg : m) {
			responseObserver.onValue(Message.newBuilder().setChannel(msg.getChannel())
					.setClientKey(msg.getClientKey()).setMessage(msg.getMessage()).build());
		}
		responseObserver.onCompleted();	
	}

}
