package curso.g07.funciones.p02;

import curso.utilidades.Consola;

/*
 * Escribir una funci�n que calcule el m�ximo com�n divisor de dos n�meros.
 *  el m�ximo com�n divisor de dos n�meros es el n�mero m�s grande que
 *  es capaz de dividir a ambos n�meros
 *  Para calcularlo podr�amos utilizar alg�n algoritmo existente o hacerlo
 *  un poco por la "cuenta de la vieja".
 *  La idea es dividir por todos los n�meros desde 1 hasta m�nimo(a, b)
 *  y quedarnos con el mayor.
 */









public class MaximoComunDivisor {

	public static void main(String[] args) {
		System.out.print("Introduce numero: ");
		int a = Consola.entero();
		System.out.print("Introduce otro: ");
		int b = Consola.entero();
		System.out.println("");
		int mcd = max_comun_divisor(a, b);
		System.out.println("El mcd de " + a + " y " + b + " es: " + mcd);

	}

	static int max_comun_divisor(int a, int b) {
		int mcd = 1;
		int min;
		min = minimo(a, b);
		mcd = 1; // existe un mcd seguro, el 1, que divide a y b.
		for (int i = 2; i <= min; i++)
			if (a % i == 0 && b % i == 0) // si i divide a "a" y "b"
				mcd = i; // i ser� el nuevo mcd.
		return (mcd);
	}

	static int minimo(int a, int b) {
		int min;
		if (a > b)
			min = b;
		else
			min = a;
		return (min);
	}

}
