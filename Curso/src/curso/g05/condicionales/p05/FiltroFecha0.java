package curso.g05.condicionales.p05;

public class FiltroFecha0 {

	public static void main(String[] args) {
		verFecha(20, 8, 2015);
		verFecha(32, 8, 2015);
		verFecha(20, 14, 2015);

	}

	public static void verFecha(int dia, int mes, int año) {

		if (dia >= 1 && dia <= 30) {
			if (mes >= 1 && mes <= 12) {
				if (año >= 0) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("Año incorrecto");
				}
			} else {
				System.out.println("Mes incorrecto");
			}
		} else {
			System.out.println("Dia incorrecto");
		}
	}

}
