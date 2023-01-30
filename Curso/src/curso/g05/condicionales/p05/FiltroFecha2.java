package curso.g05.condicionales.p05;


public class FiltroFecha2 {

	public static void main(String[] args) {
		verFecha(20,8,2015);
		
		
	}
	public static void verFecha(int dia, int mes, int año) {
		

		int diames;
		
		if (mes >= 1 && mes <= 12) {
			if (año >= 0){
				switch (mes){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					diames=31;
					break;
				case 4: case 6: case 9: case 11:
					diames=30;
					break;
				default:
					diames=28;	
				}
				if (dia<=diames)
					System.out.println("Fecha correcta");
				else
					System.out.println("Día incorrecto");
			}
			else {
				System.out.println("Año incorrecto");
			}
	} else {
			System.out.println("Mes incorrecto");
		}
		
		
		
	}

}
