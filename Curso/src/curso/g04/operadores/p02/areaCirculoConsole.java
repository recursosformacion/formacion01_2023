package curso.g04.operadores.p02;

import curso.utilidades.Consola;

/*
 * Pedir el radio de un c�rculo y calcular su �rea y su longitud
 */

public class areaCirculoConsole {

	public static void main(String[] args) {
		
			double a,r,l; // �rea y radio
			System.out.print("Introduce el radio de un circulo: ");
			r=Consola.real();
			a=Math.PI*(r*r); // para elevar al cuadrado otra opci�n es: Math.pow (r, 2)
			System.out.println("El �rea de una circunferencia de radio " + r+ " es: " + a);
			l=2*Math.PI*r;
			System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
			}

	}


