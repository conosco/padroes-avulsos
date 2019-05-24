import { BrickWallCreator } from './model/brickWallCreator';
import { BuildingCompany } from './model/buildingCompany';
import { SlabWallCreator } from './model/slabWallCreator';

const buildingCompany = new BuildingCompany();

const brickWallCreator = new BrickWallCreator();
buildingCompany.wallCreator = brickWallCreator;

buildingCompany.buildFoundation();
buildingCompany.buildRoom();
buildingCompany.buildRoof();

const slabWallCreator = new SlabWallCreator();
buildingCompany.wallCreator = slabWallCreator;

buildingCompany.buildFoundation();
buildingCompany.buildRoom();
buildingCompany.buildRoof();
