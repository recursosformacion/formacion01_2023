package curso.g99.herenciaYpolimorfismo;

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
	public void calcularArea() {

		setArea(Math.PI*radio*radio);
		return ;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando circunferencia de radio " + getRadio());
		
	}

}

