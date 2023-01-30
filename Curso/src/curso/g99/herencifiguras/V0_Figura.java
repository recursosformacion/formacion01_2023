package curso.g99.herencifiguras;

public abstract class V0_Figura {
	
	private double area;
	Coordenadas coord;
	
	
	public double getArea() {
		return calcularArea();
	}
	
	public abstract double calcularArea();	

	public abstract void dibujar();

	public Coordenadas getCoord() {
		return coord;
	}

	public void setCoord(Coordenadas coord) {
		this.coord = coord;
	}
}
