import org.jibble.pircbot.PircBot;

public class tools extends PircBot {
	private String storageString;
	private int storageint = 0;
    
    public int changeint(String x, int y) {
    	System.out.println(x + y);
    	storageString = x.substring(y);
    	System.out.println(storageString);
		storageint = Integer.parseInt(storageString);
		System.out.println(storageint);
		return storageint;
    	
	}
}
