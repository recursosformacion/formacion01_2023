package curso.g05.condicionales.p05;

public class FiltroFecha3 {

	public static void main(String[] args) {
		verFecha(20, 8, 2015);

	}

	public static void verFecha(int dia, int mes, int año) {

		int[] diaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (mes >= 1 && mes <= 12) {
			if (año != 0) {
				if (dia > 0 && dia <= diaMes[mes - 1]) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("Día incorrecto");
				}

			} else {
				System.out.println("Año incorrecto");
			}
		} else {
			System.out.println("Mes incorrecto");
		}

	}

}
