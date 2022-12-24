package curso.g07.funciones.p03;

import curso.utilidades.Consola;

/*
 * Calcular el factorial de n recursivamente.
 */
public class FactorialRecursivo {

	public static void main(String[] args) {
		int num, resultado;
		System.out.print("Introduzca el numero: ");
		num = Consola.entero();
		resultado = factorial(num);
		System.out.println(num + "! es igual a " + resultado);

	}

	static int factorial(int num) {
		int res;
		if (num == 0) // caso base: 0! es igual a 1
			res = 1;
		else
			res = num * factorial(num - 1); // n!= n*(n-1)*(n-2)... un ejemplo
											// 3!=3*2*1
		// tambi�n ocurre que n!=n*(n-1)!
		// como ejemplo 4!=4*3!
		return (res);
	}
}
