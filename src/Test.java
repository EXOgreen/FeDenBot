import org.jibble.pircbot.PircBot;

public class Test extends PircBot {
    
    public MyBot() {
        this.setName("TFC_Tuesday");
    }
    
    public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {
    	int amount = 0;
 
	while (amount >= 5){
		switch (message){
			case "!time":						
				String time = new java.util.Date().toString();
				sendMessage(channel, sender + ": The time is now " + time);
				amount = 0;
				break;
			case "!end":
				quitServer("bye");
				amount = 0;
				break;
			case "!isthis":
				sendMessage(channel, sender + ", no, this is Patrick.");
				amount = 0;
				break;
			case "!TFC_Tuesday":
				sendMessage(channel,"Yep, i'm a bot.");
				amount = 0;
				break;
			case "!potato":
				sendMessage(channel,"Poooootato!");
				amount = 0;
				break;
			case "!test":
				sendMessage(channel,"Test failed.");
				amount = 0;
				break;
			case "!amount":
				sendMessage(channel,"amount = " + amount);
				amount = 0;
				break;
			case "!tfcbot":
				sendMessage(channel,"My commands are !time, !isthis, !TFC_Tuesday, !potato, !orange, !egnaro, !coffee, and !test.");
				amount = 0;
				break;
			case "!coffee":
				sendMessage(channel,"/me gives " + sender + " coffee");
				amount = 0;
				break;
			case "!orange":
				sendMessage(channel,"Ooooorange!");
				amount = 0;
				break;
			case "!egnaro":
				sendMessage(channel,"Egnaro!");
				amount = 0;
				break;
			default:
				amount++;
			}
				// Checks what the message said.
		}
	}
}
