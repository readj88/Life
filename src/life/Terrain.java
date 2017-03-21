package life;

import java.util.Random;

public abstract class Terrain extends Element{

	
	public static Terrain[][] terrainGrid = new Terrain[Params.world_width][Params.world_height];
	
	public Terrain(int x, int y){
		super(x, y);
	}
	
	public String toString(){
		return " ";
	}
	
	public static void terrainInit(){
		for (int i = 0; i < Params.world_height; i ++){
			for (int j = 0; j < Params.world_width; j ++){
				terrainGrid[j][i] = selectTerrain(j,i);
			}
		}
	}
	
	public static Terrain selectTerrain(int x, int y){
		Random r = new Random();
		int chance = r.nextInt(100);
		
		chance = chance-Params.rockiness;
		if (chance < 0)
			return new Rock(x,y);
		
		chance = chance-Params.wetness;	
		if (x>0)
			if (terrainGrid[x-1][y] instanceof Water)
				chance = chance-Params.waterGroupingScalar*Params.wetness;
		if (y>0)
			if (terrainGrid[x][y-1] instanceof Water)
				chance = chance-Params.waterGroupingScalar*Params.wetness;
		if (chance < 0)
			return new Water(x,y);
			
		return new Dirt(x,y);
		
		
	}
}
