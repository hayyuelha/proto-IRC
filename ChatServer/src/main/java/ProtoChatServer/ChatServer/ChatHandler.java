package main.java.ProtoChatServer.ChatServer;

import main.java.io.grpc.chatservice.Channel;
import main.java.io.grpc.chatservice.ChannelUser;
import main.java.io.grpc.chatservice.Message;
import main.java.io.grpc.chatservice.User;
import io.grpc.stub.StreamObserver;
import main.java.ProtoChatServer.ChatServer.App;

public class ChatHandler implements  main.java.io.grpc.chatservice.ChatServiceGrpc.ChatService{

	public void nick(User request, StreamObserver<User> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering nick...");
//		System.out.println(request.getNick());
		responseObserver.onValue(_nick(request));
		responseObserver.onCompleted();
	}
	
	private User _nick(User u) {
//		System.out.println("in _nick " + u.getNick());
		if (u.getNick().equals("")) {
			int temp = App.users.getListUsers().size();
			User u2 = User.newBuilder().setNick("user" + String.valueOf(temp)).setClientKey(u.getClientKey()).build();
			App.users.addUser(u2);
		} else {
			App.users.addUser(u);
		}
//		System.out.println(App.users.getListUsers().get(0).getNick());
		return u;
	}
	
	public void join(ChannelUser request,
			StreamObserver<Channel> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering join...");
		responseObserver.onValue(_join(request));
		responseObserver.onCompleted();
	}
	
	private Channel _join(ChannelUser cu) {
		Channel c;
		if (cu.getChannelName().equals("")) {
			int temp = App.channels.getListChannels().size();
			c = Channel.newBuilder().setChannelName("channel" + String.valueOf(temp)).buildPartial();
			
		} else {
			c = Channel.newBuilder().setChannelName(cu.getChannelName()).buildPartial();
		}
		App.channels.addChannel(c);
		return c;
	}

	public void exit(User request, StreamObserver<User> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering exit...");
	}

	public void getMessages(User request,
			StreamObserver<Message> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering getMessages...");
	}

	public void send(Message request, StreamObserver<Message> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering send...");
	}

	public void leave(ChannelUser request,
			StreamObserver<Channel> responseObserver) {
		// TODO Auto-generated method stub
		
	}

}
