package main.java.ProtoChatServer.ChatServer;

import main.java.io.grpc.chatservice.*;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.Server;
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
	private static final Logger logger = Logger.getLogger(App.class.getName());

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
		logger.info("Server started, listening on " + port);
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
        System.out.println( "Hello World!" );
        App s = new App();
        s.start();
    }
	
	public static class Channels {
		private List<Channel> channels;
		
		public Channels() {
			channels = new ArrayList<Channel>();
		}
		
		public void addChannel(Channel channel) {
			channels.add(channel);
		}
		
		public void removeChannel(Channel channel) {
			channels.remove(channel);
		}
		
		//Check whether channel with certain name is exist
		public boolean isExist(String channelName) {
			boolean ret = false;
			int i = 0;
			while (!ret && i < channels.size()) {
				if (channels.get(i).getChannelName().equals(channelName))
					ret = true;
				i++;
			}
			return ret;
		}
		
		//Get channel instance by channelName
		public Channel getChannel(String channelName) {
			Channel chInstance = Channel.newBuilder().build();
			boolean ret = false;
			int i = 0;
			while (!ret && i < channels.size()) {
				if (channels.get(i).getChannelName().equals(channelName)) {
					ret = true;
					chInstance = channels.get(i);
				}
				i++;
			}
			return chInstance;
		}
		
		public void removeUser(User user) {
			for (Channel c : channels) {
				c.getUsersList().remove(user);
			}
		}
		
		public void addMessage(Message m) {
			for (Channel c : channels) {
				List<User> tmpList = c.getUsersList();
				for (User u : tmpList) {
					//TODO add message for user u
					Message msg = Message.newBuilder().setChannel(m.getChannel()).setMessage(m.getMessage())
							.setClientKey(m.getClientKey()).build();
					u.getMessagesList().add(msg);
				}
			}
		}
		
		public List<Channel> getListChannels() {
			return this.channels;
		}
	}
	
	public static class Users {
		private List<User> users;
		
		public Users() {
			users = new ArrayList<User>();
		}
		
		public void addUser(User user) {
			users.add(user);
		}
		
		public void removeUser(User user) {
			users.remove(user);
		}
		
		//Get user instance by clientKey
		public User getUser(String clientKey) {
			User usr = User.newBuilder().build();
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
		
		public List<User> getListUsers() {
			return this.users;
		}
	}
}
