package bridge;
import bridge.IBuildingCompany;

public class BuildingCompany implements IBuildingCompany {
	 public IWallCreator wallCreator;

	@Override
	public void buildFoundation() {
		// TODO Auto-generated method stub
		System.out.println("Foundation is built");
	}

	@Override
	public void buildRoom() {
		// TODO Auto-generated method stub
	    this.wallCreator.buildWall();
	    this.wallCreator.buildWallWithDoor();
	    this.wallCreator.buildWall();
	    this.wallCreator.buildWall();
	    System.out.println("Room is built");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		System.out.println("Roof is built");
	}
}
