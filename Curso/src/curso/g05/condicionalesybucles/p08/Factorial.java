package curso.g05.condicionalesybucles.p08;
/*
 * tengo que multiplicar el numero que me dan por el numero -1 hasta llegar a 1
 * 
 * total = numero
 * si numero es mayor que zero :
 * 		numero = numero -1
 * 		total = total * numero 
 */

public class Factorial {
	public static void main(String[] args) {
		
		long factorial;
		int num=8;
		
		factorial = 1; 
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + num + " es: " + factorial);
	}

}
