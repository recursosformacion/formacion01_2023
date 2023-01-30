package curso.g05a.buclesanidados.p10;

public class DibujaCuadrado {

	public static void main(String[] args) {
		int n = 8; // tama�o del lado
		int fila;
		int col;

		for (fila = 1; fila <= n; fila++) {
			for (col = 1; col <= n; col++)
				System.out.print("* ");
			System.out.println("");
		}

	}

}
