package curso.g03.datos;

public class DatosArrayConFor {

	public static void main(String[] args) {
		int[][] elMes = new int[5][7];
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 7; b++) {
				elMes[a][b] = a + b;
			}
		}
		int contador = 0;
		for (int a = 0; a < elMes.length; a++) {
			for (int b = 0; b < elMes[a].length; b++) {
				if (contador <= 31) {
					elMes[a][b] = ++contador;
				} 
			}
		}
		
	}
}
