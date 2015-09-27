package ProtoChatServer.ChatServer;

import io.grpc.chatservice.Channel;
import io.grpc.chatservice.Message;
import io.grpc.chatservice.User;
import io.grpc.stub.StreamObserver;

public class ChatHandler implements  io.grpc.chatservice.ChatServiceGrpc.ChatService{

	public void nick(User request, StreamObserver<User> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering nick...");
		System.out.println(request.getNick());
		responseObserver.onValue(_nick(request));
		responseObserver.onCompleted();
	}
	
	private User _nick(User u) {
		System.out.println("in _nick " + u.getNick());
		App.users.addUser(u);
		System.out.println(App.users.getListUsers().get(0).getNick());
		return u;
	}

	public void join(Channel request, StreamObserver<Channel> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering join...");
	}

	public void leave(Channel request, StreamObserver<Channel> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Entering leave...");
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

}
