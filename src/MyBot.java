import org.jibble.pircbot.*;

import java.util.Random;

public class MyBot extends PircBot {
        public MyBot() {
        this.setName("FeDenBot");
    }    	

private int eep = 0;
private int sorry = 0;
private int limit = 0;
private int amount = 0;
private long startTime = 0;

    public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {
    	Random RNG = new Random();
    	int conchMN = 0;
    	int RNGStorage;
    	int RNGMStorage;
    	
    		if (amount < limit) {amount++;}	
    		
   				if (message.toLowerCase().startsWith("!amount") && sender.equalsIgnoreCase("exogreenmc")) {
   	   				sendMessage(channel,"amount = " + amount);
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!anti") && amount == limit) {
    				sendMessage(channel,"Joke Time!");
    				amount = 0;
   				} else {}
   					
    			if (message.toLowerCase().startsWith("!arrow") && amount == limit) {
    				sendMessage(channel,"Pak needs arrows Jimmies!!");
    				amount = 0;
   				} else {}
    			
   				if (message.toLowerCase().startsWith("boop") && amount == limit) {
    				sendMessage(channel,"Tanya, they boop-ed you");
    				amount = 0;
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!bot") && amount == limit) {
    				sendMessage(channel,"Yep, i'm a bot.");
    				amount = 0;
    			} else {}
   				
    			if (message.toLowerCase().startsWith("!coffee ") && amount == limit) {
    				sendMessage(channel,"/me gives " + message.substring(8) + " coffee");
    				amount = 0;
   				} else {}
    			
    			if (message.toLowerCase().startsWith("!conch") && amount == limit) {
   					String conch[] = new String[13];
   					conch[0] = "It is certain.";
   					conch[1] = "It is decidedly so.";
   					conch[2] = "Better not to tell.";
   					conch[3] = "You may rely on it.";
   					conch[4] = "Don't count on it.";
   					conch[5] = "My reply is no.";
   					conch[6] = "Very doubtful.";
   					conch[7] = "My sources say no.";
   					conch[8] = "Most likely.";
   					conch[9] = "Signs point to yes.";
   					conch[10] = "Outlook doesn't look good.";
   					conch[11] = "The future seems hazy on this.";
   					conch[12] = "Unable to discern.";
   					conchMN = RNG.nextInt(conch.length);
   					sendMessage(channel, "" + conch[conchMN]);
   					amount = 0;
   	        	} else {}
   				
    			if (message.toLowerCase().startsWith("!cookie ") && amount == limit) {
    				sendMessage(channel,"/me gives " + message.substring(8) + " a cookie");
    				amount = 0;
   				} else {}
   				
    			if (message.toLowerCase().startsWith("!eep +") && sender.equalsIgnoreCase("exogreenmc")) {
    				eep += Integer.parseInt(message.substring (6));
	   				sendMessage(channel,"Tanyas eep count is now " + eep);
				} else {}
    		
    			if (message.toLowerCase().startsWith("!eep") && amount == limit) {
   	   				sendMessage(channel,"tanyas eep count is currently " + eep);
   	   				amount = 0;
   				} else {}
   				
    			if (message.toLowerCase().startsWith("!end") && sender.equalsIgnoreCase("exogreenmc")) {
    				quitServer("bye");
    			} else {}

   				if (message.toLowerCase().startsWith("!end") && sender.equalsIgnoreCase("ironbeast01")) {
    				quitServer("Iron did it!");
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!egnaro") && amount == limit) {
    				sendMessage(channel,"Egnaro!");
    				amount = 0;
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!febot") && amount == limit) {
    				sendMessage(channel,"My commands are !arrow, !bot, !coffee (name), !conch (question), !cookie (name), !egnaro, !FeBot, !isthis (name), !onion, !orange, !potato, and !rng (number).");
    				amount = 0;
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!halp") && amount == limit) {
    				sendMessage(channel,"!help");
    				amount = 0;
   				} else {}
   				
    			if (message.toLowerCase().startsWith("!isthis ") && amount == limit) {
    				sendMessage(channel,message.substring(8) + ", no, this is Patrick.");
    				amount = 0;
    			} else {}
    			
   				if (message.toLowerCase().startsWith("!limit") && sender.equalsIgnoreCase("exogreenmc")) {
   					limit = Integer.parseInt(message.substring (7));
   					sendMessage(channel,"You may now use the bot commands every " + limit + " messages");
   					amount = 0;
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!limit") && sender.equalsIgnoreCase("ironbeast01")) {
   					limit = Integer.parseInt(message.substring (7));
   					sendMessage(channel,"You may now use the bot commands every " + limit + " messages");
   					amount = 0;
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!lmt")  && amount == limit) {
   	   				sendMessage(channel,"The limit is curently " + limit);
   	   				amount = 0;
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!off") && sender.equalsIgnoreCase("exogreenmc")) {
   					startTime = System.currentTimeMillis();
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!onion") && amount == limit) {
    				sendMessage(channel,"Quick! Pak needs an onion!");
    				amount = 0;
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!orange") && amount == limit) {
    				sendMessage(channel,"Ooooorange!");
    				amount = 0;
   				} else {}
    			if (message.toLowerCase().startsWith("!potato") && amount == limit) {
    				sendMessage(channel,"Poooootato!");
    				amount = 0;
    			} else {}
    			
   				if (message.toLowerCase().startsWith("!shovel") && sender.equalsIgnoreCase("tanya3140")) {
   	   				sendMessage(channel,"For the best shoveler I know, Tanya.");
   	   				amount = 0;
   				} else {}
   				
    			if (message.toLowerCase().startsWith("!sorry +") && sender.equalsIgnoreCase("exogreenmc")) {
   					sorry += Integer.parseInt(message.substring (8));
	   				sendMessage(channel,"Ants sorry count is now " + sorry);
				} else {}
    		
    			if (message.toLowerCase().equalsIgnoreCase("!sorry") && amount == limit) {
   	   				sendMessage(channel,"Ants sorry count is currently " + sorry);
   	   				amount = 0;
   				} else {}
   				
    			if (message.toLowerCase().startsWith("!stop") && sender.equalsIgnoreCase("exogreenmc")) {
    				sendMessage(channel,"If its bad for you, you should probally stop.");
   				} else {}
   				
    			if (message.toLowerCase().startsWith("test") && sender.equalsIgnoreCase("ironbeast01")){
    				sendMessage(channel,"Flying colors!");
    			} else {}
    			
    			if (message.toLowerCase().startsWith("test") && amount == limit) {
    				sendMessage(channel,"Test failed.");
    				amount = 0;
    			} else {}
    			
   				if (message.toLowerCase().startsWith("!time") && sender.equalsIgnoreCase("exogreenmc")) {
    				String time = new java.util.Date().toString();
    				sendMessage(channel, sender + ": The time is now " + time);
    			} else {}
   				
   				if (message.toLowerCase().startsWith("!quote") && amount == limit) {
    				sendMessage(channel,"http://streamquotestakenwrongway.tumblr.com/");
    				amount = 0;
   				} else {}
   				
   				if (message.toLowerCase().startsWith("!rng") && amount == limit) {
    				RNGMStorage = Integer.parseInt(message.substring (5));
    				RNGStorage = 1+RNG.nextInt(RNGMStorage);
    				sendMessage(channel, "" + RNGStorage);
    				amount = 0;
   				} else {}
   				
   			}
    	}
