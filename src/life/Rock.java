package life;

public class Rock extends Terrain{

	public Rock(int x, int y) {
		super(x, y);
	}

	
	@Override
	public String toString(){
		return "^";
	}
}
