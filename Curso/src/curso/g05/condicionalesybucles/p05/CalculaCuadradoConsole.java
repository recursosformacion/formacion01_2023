package curso.g05.condicionalesybucles.p05;

import curso.utilidades.Consola;

/*
 * Leer un n�mero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un n�mero
negativo.
 */
public class CalculaCuadradoConsole {

	public static void main(String[] args) {
		int num, cuadrado;
		// num guardar� el n�mero que leamos
		// y cuadrado guardar� el cuadrado de num
		System.out.print("Introduzca n�mero: ");
		num = Consola.entero();
		while (num >= 0) { // repetimos el proceso mientras el n�mero le�do no
							// sea negativo
			cuadrado = num * num;
			System.out.println(num + "� es igual a " + cuadrado);
			System.out.print("Introduzca otro n�mero: ");
			num = Consola.entero(); // volvemos a leer num
		}

	}

}
