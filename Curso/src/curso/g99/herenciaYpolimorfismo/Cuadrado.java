package curso.g99.herenciaYpolimorfismo;

public class Cuadrado extends Figura implements Imprimible{

	Cuadrado(int lado){
		super(lado,lado);
		super.nombre="Cuadrado";
	}
	Cuadrado(int lado, int vacio){
		super(lado,lado);
		super.nombre="Cuadrado";
	}
	@Override
	public double area() {

		area=ancho*alto;
		return area;
	}
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Imprimiendo cuadrado");
	}
}

