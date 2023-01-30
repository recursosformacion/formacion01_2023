package curso.g99.herencifiguras;

public abstract class Figura {
	protected int coordenada_x, coordenada_y, ancho, alto;
	Coordenadas coor;
	protected double perimetro, area;
	protected String nombre;
	Texto
	
	Figura(int ancho, int alto){
		this.ancho=ancho;
		this.alto=alto;
	}
	Figura(int radio){
		ancho=radio*2;
		alto=radio*2;
	}
	
	public Coordenadas getCoor() {
		return coor;
	}
	public void setCoor(Coordenadas coor) {
		this.coor = coor;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public abstract double area();	
	
	
	public int getCoordenada_x() {
		return coordenada_x;
	}
	public void setCoordenada_x(int coordenada_x) {
		this.coordenada_x = coordenada_x;
	}
	public int getCoordenada_y() {
		return coordenada_y;
	}
	public void setCoordenada_y(int coordenada_y) {
		this.coordenada_y = coordenada_y;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getRadio() {
		return alto/2;
	}
	public void setRadio(int radio) {
		this.alto = 2*radio;
	}

	public void dibujar(){
		System.out.println("Dibujando "+ nombre);
	}
}
