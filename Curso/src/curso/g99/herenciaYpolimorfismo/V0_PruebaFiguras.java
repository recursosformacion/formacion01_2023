package curso.g99.herenciaYpolimorfismo;

public class V0_PruebaFiguras {

	public static void main(String[] args) {
		V0_Figura redonda = new V0_Circulo(10);
		V0_Cuadrado pequ = new V0_Cuadrado(20);
		V0_Figura bola=(V0_Figura) new V0_Circulo(2);
		Coordenadas coord = new Coordenadas();
		coord.setX(23);
		coord.setY(10);
		bola.setCoord(coord);
		
		System.out.println("Area redonda de " + ((V0_Circulo) redonda).getRadio()+"x"+redonda.getArea());
		System.out.println("Area pequ de " + pequ.getAncho()+"x"+pequ.getArea());
		System.out.println("Area bola de " +((V0_Circulo) bola).getRadio() +"x"+bola.getArea());
	
		redonda.dibujar();
		pequ.dibujar();
		bola.dibujar();
	}
	
}
