package main.java.ProtoChatServer.ChatServer;

import java.util.ArrayList;
import java.util.List;

import main.java.io.grpc.chatservice.Message;

public class UserServer {
	private String clientKey;
	private String nick;
	private List<Message> message;
	private App.Channels channels;
	
	public UserServer() {
		this.clientKey = "";
		this.nick = "";
		this.message = new ArrayList<Message>();
		this.channels = new App.Channels();
	}
	
	public UserServer(String key) {
		this.clientKey = key;
		this.message = new ArrayList<Message>();
		this.channels = new App.Channels();
	}
	
	public void setClientKey(String key) {
		this.clientKey = key;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String getNick() {
		return nick;
	}
	
	public List<Message> getMessage() {
		List<Message> m = new ArrayList<Message>();
		m.addAll(this.message);
		this.message.clear();
		return m;
	}
	
	public void addMessage(Message m) {
		message.add(m);
	}
	
	public void addMessageToAllChannels(Message m) {
		List<ChannelServer> chList = channels.getListChannels();
		for (ChannelServer c : chList) {
//			m.;
			c.addMessage(m);
		}
	}
	
	public boolean isJoinChannel(String channelName) {
		return this.channels.isExist(channelName);
	}
	
	public void addChannel(ChannelServer channel) {
		channels.addChannel(channel);
	}
	
	public void removeChannel(ChannelServer channel) {
		channels.removeChannel(channel);
	}
	
	public String getClientKey() {
		return this.clientKey;
	}
	
	public App.Channels getChannels() {
		return this.channels;
	}
}
