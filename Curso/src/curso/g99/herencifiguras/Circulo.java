package curso.g99.herencifiguras;

public class Circulo extends Figura implements Imprimible{

	
	Circulo(int radio){
		super(radio);
		super.nombre="Circulo";
	}
	@Override
	public double area() {
		if (ancho==alto){
			area= Math.PI* (getRadio())*(getRadio());
		}
		else
			area=0;
		return area;
	}
	@Override
	public void imprimir() {
		System.out.println("Imprimiendo circulo");
	}

}

