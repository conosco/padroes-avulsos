package bridge;

public class BridgeTeste {
	public static void main(String[] args) {
		BuildingCompany buildingCompany = new BuildingCompany();
		BrickWallCreator brickWallCreator = new BrickWallCreator();
		buildingCompany.wallCreator = brickWallCreator;

		buildingCompany.buildFoundation();
		buildingCompany.buildRoom();
		buildingCompany.buildRoof();
		
		SlabWallCreator slabWallCreator = new SlabWallCreator();
		buildingCompany.wallCreator = slabWallCreator;


		buildingCompany.buildFoundation();
		buildingCompany.buildRoom();
		buildingCompany.buildRoof();
	}
}
