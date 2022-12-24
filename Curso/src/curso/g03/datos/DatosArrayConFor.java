package curso.g03.datos;

public class DatosArrayConFor {

	public static void main(String[] args) {
		int[][] elMes = new int[5][7];
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 7; b++) {
				elMes[a][b] = a + b;
			}
		}

		for (int a = 0; a < elMes.length; a++) {
			for (int b = 0; b < elMes[a].length; b++) {
				elMes[a][b] = a + b;
			}
		}
	}
}
