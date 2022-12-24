package curso.g05.condicionalesybucles.p07;

public class SumaCinco {

	final static int NUMERO = 5;
	public static void main(String[] args) {
		int contador=10;
		int indice=0;
		
		long total=0;
		while (contador>0){
			if (++indice%NUMERO ==0){
				--contador;
				total+=indice;
				System.out.println(indice);
			}
		}
		System.out.println("El total es:"+total);
	}

}
/*
 * sumo 1
 * si es multiplo lo añado a total y cuento 1
 * si no he contado 10, repito
 *  
 */
