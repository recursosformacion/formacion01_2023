package curso.g99.herenciaYpolimorfismo;

public abstract class V0_Figura {
	
	
	Coordenadas coord;
	
	
	public double getArea() {
		return calcularArea();
	}

	public void setArea(double area) {
		
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
