package life;

public class Water extends Terrain {

	public Water(int x, int y) {
		super(x, y);
	}
	
	@Override
	public String toString(){
		return "~";
	}

}
