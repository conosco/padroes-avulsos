package bridge;
import bridge.IWallCreator;

public class BrickWallCreator implements IWallCreator {
    public void buildWall() {
    	System.out.println("Built brick wall");
    }
    
    public void buildWallWithDoor() {
    	System.out.println("Built brick wall with door");
    }
}
