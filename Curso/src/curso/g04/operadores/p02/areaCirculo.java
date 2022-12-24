package curso.g04.operadores.p02;



/*
 * Pedir el radio de un circulo y calcular su  area y su longitud
 */

public class areaCirculo {

	public static void main(String[] args) {

		double r = 23; // radio
		double a, l; // �rea

		a = Math.PI * (r * r); // para elevar al cuadrado otra opci�n es:
								// Math.pow (r, 2)
		System.out.println("El area de una circunferencia de radio " + r + " es: " + a);
		l = 2 * Math.PI * r;
		System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
	}

}
