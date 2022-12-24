package curso.g05a.buclesanidados.p11;

public class Primos2 {
	static boolean lista[],lista2[];
	static int max =  2147483645; //2147483647; //1000000000;
	static long maximo =  3000483645l; 
	static int primos;
	static long lastPrimo;
	

	public static void main(String[] args) throws Exception {
		
		lista = new boolean[max];
		lista2=new boolean[max/2];
		primos++;
		lastPrimo = 2;
		long startTime = System.currentTimeMillis();
		for (long b = 3; b < (maximo); b += 2) {
			boolean res;
			if (b<=max-1) {
				int an = (int) b;
				res = lista[an];
			} else {
				int an = (int) (b - max);
				res = lista2[an];
			}
			if (!res) {
				descarta(b);
				lastPrimo = b;
				primos++;
				//System.out.println(b);
				if (primos % 10000 == 0)
					System.out.println(b);
			}

		}
		long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println(elapsedTime);
		System.out.println("Numero primos:" + primos);
		System.out.println("Mayor:" + lastPrimo);

	}

	
	public static void descarta(long numero) throws Exception {
		long tope = maximo-numero+2;
		long a = 0;
		try {
			for (a = numero; a < tope ; a += numero) {
				if (a<=max-1) {
					int an = (int) a;
					lista[an]=true;
				} else {
					int an = (int) (a - max);
					lista2[an]=true;
				}
			}
		} catch (Exception e) {
			System.out.println(numero + "//" + maximo + "//" + a);
			throw new Exception();
		}
/////////////////////Falla: el ultimo numero no es primo
	}

}
