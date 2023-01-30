package curso.g99.herencifiguras;

public class PruebaFiguras3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura redonda = new Circulo(10);
		Rectangulo pequ = new Rectangulo(20,20);
		Figura bola=(Figura) new Circulo(2);
		
		presenta(redonda);
		presenta(pequ);
		presenta(bola);
		
	}
	private static void presenta(Figura dato){
		String nombre ="";
		if (dato instanceof Circulo) nombre="Circulo";
		if (dato instanceof Rectangulo) nombre="Rectangulo";
		if (dato instanceof Cuadrado) nombre="Cuadrado";
		System.out.println("Area " + 
								nombre +
								"  de " + 
								dato.getAncho()+
								"x"+
								dato.getAlto()+
								"="+
								dato.area());
	}
}

