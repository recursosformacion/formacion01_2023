package curso.g06.cadenas.p01;

public class zzz {
	
	public static void main(String args[]){
		String entrada="Esto es un mensaje";
		int importe = 32;
		
		imprimir(entrada,importe);
		System.out.println("entrada="+entrada);
		System.out.println("importe="+importe);	
		
		String a = "Hola";
		String b = a;
		String c = "Hola";
		if (a==b) 
			System.out.println("Son iguales");
		if (a==c) 
			System.out.println("Son iguales tambien");
		if ((a+b)==(b+c)) 
			System.out.println("Son iguales y tambien");
		a="Adios";
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
				
	static void imprimir(String impresion, int valor){
		impresion = impresion + "\n y el valor es ";
		
		System.out.println(impresion + " = " + valor);
		valor=123;
	}
}
