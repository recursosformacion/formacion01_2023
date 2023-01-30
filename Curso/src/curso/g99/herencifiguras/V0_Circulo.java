package curso.g99.herencifiguras;

public class V0_Circulo extends V0_Figura {

	private double radio;
	
	
	V0_Circulo(){}
	
	V0_Circulo(double radio){
		setRadio(radio);
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {

		
		return Math.PI*radio*radio;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando circunferencia de radio " + getRadio());
		
	}

	

}

