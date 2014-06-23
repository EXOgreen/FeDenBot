import java.util.Scanner;
// Gets the scanner utility

public class MyBotMain {
	
    
    public static void main(String[] args) throws Exception {
    	
        int majorVersion = 1;
        int minorVersion = 0;
        int patchVersion = 1;
        
    	Scanner scanner = new Scanner(System.in);
    	String server;
    	String portS;
    	int port = 80;
    	String password;
    	String channel;
    	
    	System.out.println("FeDenBot version " + majorVersion + "." + minorVersion + "." + patchVersion);
    	
    	System.out.println("server?");
    	//server = "199.9.248.248";
    	System.out.println("199.9.248.248");
    	server = scanner.nextLine();
    	
    	System.out.println("Port?");
    	portS = scanner.nextLine();
    	port = Integer.parseInt(portS.substring (0));
		
		System.out.println("password?");
		password = scanner.nextLine();
    	
		System.out.println("channel?");
		//channel = "_ironbeast01_1399075067209";
		System.out.println("_ironbeast01_1399075067209");
		channel = scanner.nextLine();
		
        // Now start our bot up.
        MyBot bot = new MyBot();
        
        // Enable debugging output.
        bot.setVerbose(true);
        
        // Connect to the IRC server.
        bot.connect(server,port,password);

        // Join the #pircbot channel.
        bot.joinChannel("#" + channel);

    }
    
}