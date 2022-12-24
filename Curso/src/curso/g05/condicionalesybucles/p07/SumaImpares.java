package curso.g05.condicionalesybucles.p07;

/*
 * Dise�ar un programa que muestre el producto de los 10 primeros n�meros impares.
 */






















public class SumaImpares {

	public static void main(String[] args) {
		long producto=1; // producto guardar� la multiplicaci�n de los 10 primeros n�meros impares.
		// es muy importante acordarse de inicializarlo a 1. Ya que si lo hacemos a 0,
		// para calcular los 10 primeros n�meros impares utilizamos un for que:
		//
		// comience en 1
		// y en cada vuelta se incremente en 2, as� obtenemos
		// 1, 3, 5, 7, 9, 11, 13, 15, 17, 19.
		for (int i=1; i<20; i+=2) {
		producto=producto*i;
		}
		System.out.println("La multiplicaci�n de los 10 primeros impares: " + producto);

	}

}
