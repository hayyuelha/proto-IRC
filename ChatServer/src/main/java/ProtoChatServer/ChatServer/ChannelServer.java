package main.java.ProtoChatServer.ChatServer;

import java.util.ArrayList;
import java.util.List;

import main.java.io.grpc.chatservice.Message;

public class ChannelServer {
	private String name;
	private List<UserServer> members;
	
	public ChannelServer() {
		name = "";
		members = new ArrayList<UserServer>();
	}
	
	public ChannelServer(String name) {
		members = new ArrayList<UserServer>();
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addMember(UserServer u) {
		this.members.add(u);
	}
	
	public void removeMember(UserServer u) {
		this.members.remove(u);
	}
	
	public void addMessage(Message m) {
		for (UserServer u :  members) {
			Message tempMsg = Message.newBuilder().setChannel(m.getChannel()).setClientKey(m.getClientKey())
					.setMessage(m.getMessage()).build();
			u.addMessage(tempMsg);
		}
	}
	
	public int getUsersCount() {
		return members.size();
	}
}
