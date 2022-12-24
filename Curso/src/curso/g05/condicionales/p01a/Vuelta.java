package curso.g05.condicionales.p01a;

public class Vuelta {

	public static void main(String[] args) {
		String entrada = "";
		int lg = args.length;
		for (int a = 0; a < lg; a++) {
			entrada += args[a] + " ";
		}
		System.out.println("fase-1-" + entrada);

		int longitud = entrada.length();
		int a;
		for (a = longitud - 1; a >= 0; a--)
			System.out.print(entrada.charAt(a));
		System.out.println();

		String salida = "";
		for (a = longitud - 1; a >= 0; a--)
			salida += entrada.charAt(a);
		System.out.println("fase-2-" + salida);

		String salida1 = "";
		for (a = longitud - 1; a >= 0; a--)
			switch (entrada.charAt(a)) {
			// switch(entrada.substring(a, a+1).toLowerCase()){
			case 'a':
			case 'A':
				salida1 += 4;
				break;
			case 'e':
			case 'E':
				salida1 += 3;
				break;
			case 'i':
			case 'I':
				salida1 += 1;
				break;
			case 'o':
			case 'O':
				salida1 += 0;
				break;
			case 'u':
			case 'U':
				salida1 += 9;
				break;
			default:
				salida1 += entrada.charAt(a);
			}

		System.out.println("fase-3-" + salida1);

		System.out.print("fase 4-");

		char bus = entrada.charAt(0);

		for (a = 1; (entrada + bus).charAt(a) != bus; a++)
			System.out.print(entrada.charAt(a));
		System.out.println();

		System.out.print("fase 5-");

		entrada += (char) 0;
		int pos = 0;
		salida = "";
		while (entrada.charAt(pos) != (char) 0)
			salida = entrada.charAt(pos++) + salida;

		System.out.println(salida);

		/* inversion de lugar de palabras */

		entrada = "";
		// int lg=args.length;
		for (int az = 0; az < lg; az++) {
			entrada = args[az] + " " + entrada;
		}

		System.out.println("fase-6-" + entrada);

		/* inversion de letras */

		String finaliza = "";
		for (int az = 0; az < lg; az++) {
			salida = "";
			entrada = args[az];
			longitud = entrada.length();
			for (a = longitud - 1; a >= 0; a--)
				salida += entrada.charAt(a);
			finaliza += salida + " ";
		}
		System.out.println("fase-7-" + finaliza);
	}

}