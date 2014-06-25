import org.jibble.pircbot.PircBot;

public class tools extends PircBot {
	private int storageint = 0;
    
    public int changeint(String x, int y) {
    	storageint = Integer.parseInt(x.substring (y));
		return storageint;
    	
	}
}
