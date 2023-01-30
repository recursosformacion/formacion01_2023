package curso.g99.herencifiguras;

public class V0_Cuadrado extends V0_Figura {

	private double ancho;
	
	V0_Cuadrado(){}
	
	V0_Cuadrado(double ancho){
		setAncho(ancho);
	}
	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public double calcularArea() {

		return ancho*ancho;
	
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

}

