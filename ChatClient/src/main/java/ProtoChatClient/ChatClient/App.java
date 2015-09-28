package main.java.ProtoChatClient.ChatClient;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Scanner;

import main.java.io.grpc.chatservice.*;
import main.java.io.grpc.chatservice.ChatServiceGrpc.ChatService;
import main.java.io.grpc.chatservice.ChatServiceGrpc.ChatServiceBlockingStub;
import io.grpc.ChannelImpl;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final int port = 8000;
	private static final String host = "localhost";
	private static ChannelImpl client;
	private static String clientKey;
	private static ChatServiceBlockingStub blockingStub;
	private static ChatService asyncStub;
	public static boolean exit = false;
	
    public static void main( String[] args )
    {
        client = NettyChannelBuilder.forAddress(host, port)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();
        blockingStub = ChatServiceGrpc.newBlockingStub(client);
        asyncStub = ChatServiceGrpc.newStub(client);
        
        SecureRandom random = new SecureRandom(); //generate key for client
		clientKey = new BigInteger(35, random).toString(32);
		System.out.println("Starting client ...");
		Thread receiver = new Thread(){
			@Override
			public void run() {
				while (!exit) {
						Iterator<Message> mlist = blockingStub.getMessages(User.newBuilder().setClientKey(clientKey).buildPartial());
						if (mlist.hasNext()) {
							Message m = mlist.next();
							System.out.println("[" + m.getChannel() + "] (" + m.getClientKey() + ") " + m.getMessage());
						}
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}
		};
		Thread sender = new Thread(){
			@Override
			public void run() {
				while (!exit) {
						perform(blockingStub);
				}
			}
		};
		sender.start();
		receiver.start();
		try {
			sender.join();
			receiver.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    
    private static void perform(ChatServiceBlockingStub b)
    {
		RetVal ret;
		Scanner input = new Scanner(System.in);
		String cmdString = input.nextLine();
		if (cmdString.startsWith("/")){
			String[] cmd = cmdString.split("\\s+");
			User u;
			ChannelUser cu;
			User retU;
			switch (cmd[0]){
				case "/NICK":	
					if (cmd.length > 1)
						u = User.newBuilder().setNick(cmd[1]).setClientKey(clientKey).build();
					else
						u = User.newBuilder().setNick("").setClientKey(clientKey).build();
					ret = b.nick(u);
					System.out.println(ret.getRetval());
					break;
				case "/JOIN":	
					if (cmd.length > 1) 
						cu = ChannelUser.newBuilder().setClientKey(clientKey).setChannelName(cmd[1]).build();
					else
						cu = ChannelUser.newBuilder().setClientKey(clientKey).setChannelName("").build();
					ret = b.join(cu);
					System.out.println(ret.getRetval());
					break;
				case "/LEAVE": 	
					if (cmd.length > 1) 
						cu = ChannelUser.newBuilder().setClientKey(clientKey).setChannelName(cmd[1]).build();
					else
						cu = ChannelUser.newBuilder().setClientKey(clientKey).setChannelName("").build();
					ret = b.leave(cu);
					System.out.println(ret.getRetval());
					break;
				case "/EXIT":
					u = User.newBuilder().setClientKey(clientKey).buildPartial();
					ret = b.exit(u);
					System.out.println(ret.getRetval());
					exit = true;
					break;
				default:
					break;
			}
		} 
		else if (cmdString.startsWith("@")){
			String chName = null;
			String msg = null;
			if(cmdString.contains(" ")){
				int idx = cmdString.indexOf(" ");
			    chName = cmdString.substring(1, idx);
			    msg = cmdString.substring(idx+1);
			}
			ret = b.send(Message.newBuilder().setChannel(chName).setClientKey(clientKey)
					.setMessage(msg).build());
		} else {
			ret = b.send(Message.newBuilder().setChannel("").setClientKey(clientKey)
					.setMessage(cmdString).build());
		}
    }
}
