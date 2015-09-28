package main.java.ProtoChatServer.ChatServer;

import main.java.io.grpc.chatservice.*;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.ServerImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private final int port = 8000;
	private ServerImpl server;
	
	public static Channels channels;
	public static Users users;
	public static ChatHandler handler;
	
	/** Start serving requests. */
	public void start() throws IOException {
	    // TODO implement start server
		server = NettyServerBuilder.forPort(port)
				.addService(ChatServiceGrpc.bindService(new ChatHandler()))
				.build().start();
		
		users = new Users();
		channels = new Channels();
		Runtime.getRuntime().addShutdownHook(new Thread() {
		      @Override
		      public void run() {
		        // Use stderr here since the logger may has been reset by its JVM shutdown hook.
		        System.err.println("*** shutting down gRPC server since JVM is shutting down");
		        App.this.stop();
		        System.err.println("*** server shut down");
		      }
		    });
	}
	
    protected void stop() {
		// TODO Auto-generated method stub
    	if (server != null) {
    	   server.shutdown();
    	}
	}
    
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
          server.awaitTermination();
        }
    }

	public static void main( String[] args ) throws IOException
    {
        System.out.println("Starting server...");
		App s = new App();
        s.start();
    }
	
	public static class Channels {
		private List<ChannelServer> channels;
		
		public Channels() {
			channels = new ArrayList<ChannelServer>();
		}
		
		public void addChannel(ChannelServer channel) {
			channels.add(channel);
		}
		
		public void removeChannel(ChannelServer channel) {
			channels.remove(channel);
		}
		
		//Check whether channel with certain name is exist
		public boolean isExist(String channelName) {
			boolean ret = false;
			int i = 0;
			while (!ret && i < channels.size()) {
				if (channels.get(i).getName().equals(channelName))
					ret = true;
				i++;
			}
			return ret;
		}
		
		//Get channel instance by channelName
		public ChannelServer getChannel(String channelName) {
			ChannelServer chInstance = new ChannelServer();
			boolean ret = false;
			int i = 0;
			while (!ret && i < channels.size()) {
				if (channels.get(i).getName().equals(channelName)) {
					ret = true;
					chInstance = channels.get(i);
				}
				i++;
			}
			return chInstance;
		}
		
		public void removeUser(UserServer user) {
			for (ChannelServer c : channels) {
				c.removeMember(user);
			}
		}
		
		public List<ChannelServer> getListChannels() {
			return this.channels;
		}
	}
	
	public static class Users {
		private List<UserServer> users;
		
		public Users() {
			users = new ArrayList<UserServer>();
		}
		
		public void addUser(UserServer user) {
			users.add(user);
		}
		
		public void removeUser(UserServer user) {
			users.remove(user);
		}
		
		//Get user instance by clientKey
		public UserServer getUser(String clientKey) {
			UserServer usr = new UserServer();
			boolean ret = false;
			int i = 0;
			while (!ret && i < users.size()) {
				if (users.get(i).getClientKey().equals(clientKey)) {
					ret = true;
					usr = users.get(i);
				}
				i++;
			}
			return usr;
		}
		
		public List<UserServer> getListUsers() {
			return this.users;
		}
	}
}
