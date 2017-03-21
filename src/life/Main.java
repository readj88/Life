package life;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		init();
		displayWorld();
		sc.nextLine();
		
	
		
	}

	
	public static void init(){
		Terrain.terrainInit();
	}
	
	
	
	
	public static void displayWorld() {
		printBorderLine();
		for (int i = 0; i < Params.world_height; i++){
			System.out.print("|");
			for (int j = 0; j < Params.world_width; j++){
				System.out.print(Terrain.terrainGrid[j][i]);
			}
			System.out.print("|");
			System.out.println();
		}
		printBorderLine();
	}
	
	
	/**
	 * Helper function for displayWorld
	 * called for top/bottom border
	 */
	private static void printBorderLine(){
		System.out.print("+");
		for (int i = 0; i < Params.world_width; i++){
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
	}
}
