package main.java.ProtoChatServer.ChatServer;

import java.util.Collection;
import java.util.List;

import main.java.io.grpc.chatservice.Channel;
import main.java.io.grpc.chatservice.ChannelUser;
import main.java.io.grpc.chatservice.Message;
import main.java.io.grpc.chatservice.RetVal;
import main.java.io.grpc.chatservice.User;
import io.grpc.stub.StreamObserver;
import main.java.ProtoChatServer.ChatServer.App;

public class ChatHandler implements  main.java.io.grpc.chatservice.ChatServiceGrpc.ChatService{


	private RetVal _nick(User u) {
//		System.out.println("in _nick " + u.getNick());
		User u2;
		if (u.getNick().equals("")) {
			int temp = App.users.getListUsers().size();
			u2 = User.newBuilder().setNick("user" + String.valueOf(temp)).setClientKey(u.getClientKey()).build();
			
		} else {
			u2 = User.newBuilder().setNick(u.getNick()).setClientKey(u.getClientKey()).build();
			
		}
		App.users.addUser(u2);
//		System.out.println(App.users.getListUsers().get(0).getNick());
		RetVal r = RetVal.newBuilder().setRetval("Online as " + u2.getNick()).build();
		return r;
	}
	
	private RetVal _join(ChannelUser cu) {
		Channel c;
		if (cu.getChannelName().equals("")) {
			int temp = App.channels.getListChannels().size();
			c = Channel.newBuilder().setChannelName("channel" + String.valueOf(temp)).buildPartial();
			
		} else {
			c = Channel.newBuilder().setChannelName(cu.getChannelName()).buildPartial();
		}
		App.channels.addChannel(c);
		RetVal r = RetVal.newBuilder().setRetval("Join channel " + c.getChannelName()).build();
		return r;
	}

	public void nick(User request, StreamObserver<RetVal> responseObserver) {
		// TODO Auto-generated method stub
		responseObserver.onValue(_nick(request));
		responseObserver.onCompleted();
	}

	public void join(ChannelUser request,
			StreamObserver<RetVal> responseObserver) {
		// TODO Auto-generated method stub
		responseObserver.onValue(_join(request));
		responseObserver.onCompleted();
	}

	public void leave(ChannelUser request,
			StreamObserver<RetVal> responseObserver) {
		// TODO Auto-generated method stub
		responseObserver.onValue(_leave(request));
		responseObserver.onCompleted();
	}
	
	public RetVal _leave(ChannelUser cu) {
		User user = App.users.getUser(cu.getClientKey());
		System.out.println(user.getNick() + ": /LEAVE " + cu.getChannelName());
		Channel c;
		if (cu.getChannelName().isEmpty()) {
			return RetVal.newBuilder().setRetval("Channel name couldn't be empty").build();
		} else if (!App.channels.isExist(cu.getChannelName())) {
			return RetVal.newBuilder().setRetval("Channel not found").build();
		}
		
		c = App.channels.getChannel(cu.getChannelName());
		System.out.println(c.getUsersList().get(0));
		if (!c.getUsersList().contains(user)){
			return RetVal.newBuilder().setRetval("You're not registered as member of " + c.getChannelName()).build();
		}
		c.getUsersList().remove(user);
		user.getChannelsList().remove(c);
		return RetVal.newBuilder().setRetval("Leaving channel " + c.getChannelName()).build();
	}

	public void exit(User request, StreamObserver<RetVal> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering exit...");
		responseObserver.onValue(_exit(request));
		responseObserver.onCompleted();		
	}
	
	public RetVal _exit(User u) {
		User user = App.users.getUser(u.getClientKey());
		System.out.println(user.getNick() + ": /EXIT");
		App.channels.removeUser(user);
		App.users.removeUser(user);
		RetVal r = RetVal.newBuilder().setRetval("Going offline...").build();
		return r;
	}

	public void send(Message request, StreamObserver<RetVal> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Sending...");
		responseObserver.onValue(_send(request));
		responseObserver.onCompleted();	
	}
	
	public RetVal _send(Message m) {
		User user = App.users.getUser(m.getClientKey());
		if (m.getChannel().isEmpty()) {	//send to all user's channels
			List<Channel> userChannels = user.getChannelsList();
			for (Channel c : userChannels) {
				Message tempMsg = Message.newBuilder().setChannel(c.getChannelName()).setClientKey(user.getNick())
						.setMessage(m.getMessage()).build();
				_sendToChannel(tempMsg, c);
			}
		} else {
			Channel c = App.channels.getChannel(
					m.getChannel());
			Message tempMsg = Message.newBuilder().setChannel(c.getChannelName()).setClientKey(user.getNick())
					.setMessage(m.getMessage()).build();
			_sendToChannel(tempMsg, c);
		}
		return RetVal.newBuilder().setRetval("Delivered!").build();
	}
	
	public void _sendToChannel(Message m, Channel c) {
		List<User> member = c.getUsersList();
		for (User u : member) {
			u.getMessagesList().add(m);
		}
	}

	public void getMessages(User request,
			StreamObserver<Message> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving...");
		User user = App.users.getUser(request.getClientKey());
		List<Message> m = user.getMessagesList();
		for (Message msg : m) {
			responseObserver.onValue(msg);
		}
		responseObserver.onCompleted();	
	}
	
	public Message _getMessages(User u) {
		User user = App.users.getUser(u.getClientKey());
		Message m = null; 
		if (!user.getMessagesList().isEmpty())		
			m = user.getMessagesList().get(0);
		return m;
	}

}
