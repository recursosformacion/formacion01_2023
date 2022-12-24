package curso.g05.condicionales.p01a;

public class Condicionales {

	public static void main(String[] args) {

		for (int a=args.length-1;a>=0;a--){
			System.out.print(args[a] + " ");
		}
		System.out.println("fase-0------------------------");
		
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

		System.out.println("hola                         esta bien         ".trim() + "/");
	}
}
