package curso.g05.condicionales.p01;

import curso.utilidades.Consola;

/*
 * Pedir los coeficientes de una ecuaci�n se 2� grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.
 */

public class Ecuacion2 {

	public static void main(String[] args) {
	
		int a, b, c;
		System.out.println("Introduzca primer coeficiente (a):");
		a = Consola.entero();
		System.out.println("Introduzca segundo coeficiente: (b):");
		b = Consola.entero();
		System.out.println("Introduzca tercer coeficiente: (c):");
		c = Consola.entero();
		// calculamos el determinante

		if (b * b < 4 * a * c) {
			System.out.println("Solucion perteneciente al campo de los numeros complejos.");
		} else if (a != 0 && b * b > 4 * a * c) {
			System.out.println("La primera solucion es " + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			System.out.println("La segunda solucion es " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
		} else {
			System.out.println("Esta ecuacion no es de segundo grado.");
		}

		
	}
}
