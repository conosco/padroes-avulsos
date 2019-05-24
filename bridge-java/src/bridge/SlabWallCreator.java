package bridge;
import bridge.IWallCreator;

public class SlabWallCreator implements IWallCreator {
    public void buildWall() {
    	System.out.println("Built slab wall");
    }
    
    public void buildWallWithDoor() {
    	System.out.println("Built slab wall with door");
    }
}
