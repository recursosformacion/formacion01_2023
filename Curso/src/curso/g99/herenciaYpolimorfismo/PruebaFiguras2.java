package curso.g99.herenciaYpolimorfismo;

public class PruebaFiguras2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura redonda = new Circulo(10);
		Rectangulo2 pequ = new Rectangulo2(20,20);
		Figura bola=(Figura) new Rectangulo(2,3);
		Circulo grande = new Circulo(10);
		
		presenta(redonda);
		presenta(pequ);
		presenta(bola);
		imprime(grande);
	}
	static void imprime(Imprimible dato){
		
	}
	private static void presenta(Figura dato){
		System.out.println("Area " + 
								dato.getClass().getSimpleName() +
								"  de " + 
								dato.getAncho()+
								"x"+
								dato.getAlto()+
								"="+
								dato.area());
		if (dato instanceof Rectangulo2){
			 Rectangulo2 tmp = (Rectangulo2) dato;
			 tmp.dibujar();
		}
	}
}

