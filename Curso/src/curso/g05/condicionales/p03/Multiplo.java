package curso.g05.condicionales.p03;

/**
 * Pedir dos números y decir cual es el mayor o si son iguales
 * y si uno es multiplo de otro
 */

public class Multiplo {

	public static void main(String[] args) {
		compara(10, 20);
		compara(23, 5);
		compara(210, 2);
		compara(0, 2);

		return;
	}

	public static void  compara(int n1, int n2) {	
	
		// si ambos números son iguales diría que n2 es mayor que n1
		if (n1 == n2)
			System.out.println("Son iguales");
		else {
			if (n1 > n2)
				System.out.println(n1 + " es mayor que " + n2);
			else
				System.out.println(n2 + " es mayor que " + n1);
		}
		if (n1==0 || n2 = 0) {
			System.out.println("No son múltiplos");
		} else {
			if (n1 % n2 == 0 || n2 % n1 == 0)
				System.out.println("Son múltiplos");
			else
				System.out.println("No son múltiplos");
		}
	}

}
