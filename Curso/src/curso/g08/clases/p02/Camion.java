package curso.g08.clases.p02;

public class Camion extends Vehiculo {

	private double pmax;
	private double precio;
	
	public Camion(String modelo, int marchas, double velocidad, String matricula, String chasis, int ruedas, double pmax, double precio) {
		super(modelo,marchas, velocidad, matricula, chasis, ruedas);
		this.pmax = pmax;
		this.precio = precio;
	}

	public double getPmax() {
		return pmax;
	}

	public void setPmax(double pmax) {
		this.pmax = pmax;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
