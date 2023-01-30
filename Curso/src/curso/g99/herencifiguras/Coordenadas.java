package curso.g99.herencifiguras;

public class Coordenadas {
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void inverse() {
		int tmp = x;
		x=y;
		y=tmp;
	}
	
	
}
