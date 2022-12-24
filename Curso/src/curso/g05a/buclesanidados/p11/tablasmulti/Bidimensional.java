package curso.g05a.buclesanidados.p11.tablasmulti;

/*
 * Crear una tabla bidimensional de tama�o 5x5 y rellenarla de la siguiente forma: 
 * la posici�n T[n,m]
 * debe contener n+m. Despu�s se debe mostrar su contenido
 */
public class Bidimensional {


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int t[][]; // definimos t como una tabla bidimensional
		t = new int[5][5]; // creamos la tabla de 5x5
		for (int i = 0; i < 5; i++) // utilizamos i para la primera dimensi�n
		{
			for (int j = 0; j < 5; j++) // utilizamos j para la segunda
										// dimensi�n
			{
				t[i][j] = i + j;
			}
		}
		System.out.println("TABLA: ");
		for (int i = 4; i >= 0; i--) {
			
			for (int j = 0; j < 5; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("TABLA: ");
		for (int i = 0; i< t.length; i++) {
			
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}

}
