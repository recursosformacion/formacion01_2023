package curso.g05.condicionales.p06;

public class NumeroAletras0 {

	public static void main(String[] args) {
		String[] parte1 = { "","uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
		String[] parte2 = { "","diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
				"noventa" };
		int num = 72;
		int unidades, decenas;
		
		unidades = num % 10;
		decenas = num / 10;
		
		System.out.println(parte2[decenas] + " y " +parte1[unidades]);
	}

}
