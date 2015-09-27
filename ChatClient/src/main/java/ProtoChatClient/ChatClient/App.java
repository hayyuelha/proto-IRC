package main.java.ProtoChatClient.ChatClient;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;

import main.java.io.grpc.chatservice.*;
import main.java.io.grpc.chatservice.ChatServiceGrpc.ChatService;
import main.java.io.grpc.chatservice.ChatServiceGrpc.ChatServiceBlockingClient;
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
	private static ChatServiceBlockingClient blockingStub;
	private static ChatService asyncStub;
	
    public static void main( String[] args )
    {
        client = NettyChannelBuilder.forAddress(host, port)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();
        blockingStub = ChatServiceGrpc.newBlockingStub(client);
        asyncStub = ChatServiceGrpc.newStub(client);
        
        SecureRandom random = new SecureRandom(); //generate key for client
		clientKey = new BigInteger(35, random).toString(32);
        
		Scanner input = new Scanner(System.in);
		String cmdString = input.nextLine();
		if (cmdString.startsWith("/")){
			String[] cmd = cmdString.split("\\s+");
			switch (cmd[0]){
				case "/NICK" :
					User u = User.newBuilder().setNick("test").setClientKey("token").build();
					User ret = blockingStub.nick(u);
					System.out.println(ret.getNick());
					break;
				default :
					break;
			}
			
		}
    }
    
    private static void perform(ChatServiceBlockingStub b)
    {
		String ret = "";
		Scanner input = new Scanner(System.in);
		String cmdString = input.nextLine();
		if (cmdString.startsWith("/")){
			String[] cmd = cmdString.split("\\s+");
			User u;
			ChannelUser cu;
			User retU;
			Channel retC;
			switch (cmd[0]){
				case "/NICK":	
					if (cmd.length == 1)
						cmd[1] = "";
					
					u = User.newBuilder().setNick(cmd[1]).setClientKey(clientKey).build();
					retU = blockingStub.nick(u);
					System.out.println("Online as " + retU.getNick());
					
					break;
				case "/JOIN":	
					if (cmd.length == 1)
						cmd[1] = ""; 
					
					cu = ChannelUser.newBuilder().setClientKey(clientKey).setChannelName(cmd[1]).build();
					retC = blockingStub.join(cu);
					System.out.println("Join channel " + retC.getChannelName());
					break;
//				case "/LEAVE": 	
//					ret = client.leave(cmd[1], clientKey);
//					System.out.println(ret);
//					break;
//				case "/EXIT": 	
//					ret = client.exit(clientKey);
//					System.out.println("Going offline...");
//					exit = true;
//					break;
				default:
					break;
			}
		} 
//		else if (cmdString.startsWith("@")){
//			String chName = null;
//			String msg = null;
//			if(cmdString.contains(" ")){
//				int idx = cmdString.indexOf(" ");
//			    chName = cmdString.substring(1, idx);
//			    msg = cmdString.substring(idx+1);
//			}
//			ret = client.send(new Message(chName, msg, clientKey));
//		} else {
//			ret = client.send(new Message("", cmdString, clientKey));
//		}
    }
}
