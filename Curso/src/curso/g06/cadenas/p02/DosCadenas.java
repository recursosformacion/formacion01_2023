package curso.g06.cadenas.p02;

public class DosCadenas {

	public static void main(String[] args) {
		String s = "Hola";
		String h=s;
		String j="Adios";
		String i=s;
		if (h==i)
			System.out.println("h e i son la misma string");
		else
			System.out.println("h e i no son la misma string");
		
		if (h==j)
			System.out.println("h y j son la misma string"+ "h="+h+" j="+j);
		else
			System.out.println("h y j no son la misma string");
		
		j=s;
		if (h==j)
			System.out.println("ahora, h y j son la misma string");
		else
			System.out.println("ahora, h y j no son la misma string");
		
		
		String a = "Esto es una string";
		String b = "Y esto tambien";
		
		if (a.compareTo(b)==0) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		String c = a + b;
		String d = a + b;
		System.out.println("Comparando por punteros " + (c==d));
		System.out.println("comparando por strings " + (c.compareTo(d)==0));
		System.out.println("La string a tiene " + a.length() + "caracteres");
		System.out.println("La string b tiene " + b.length() + "caracteres");
		System.out.println("La string c tiene " + c.length() + "caracteres");
		System.out.println("La string d tiene " + d.length() + "caracteres");
		
		b=a;
		if (b==a) {
			System.out.println("a y b apuntando al mismo sitio");
		}
		else{
			System.out.println("a y b NO apuntando al mismo sitio");
		}
		a=a.replace("e","k");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		if (b==a) {
			System.out.println("a y b todavia apuntando al mismo sitio");
		}
		else{
			System.out.println("a y b y ahora ya NO apuntando al mismo sitio");
		}
	}

}
