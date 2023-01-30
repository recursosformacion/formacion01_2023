package curso.g11.colecciones;

import java.util.*;

public class PruebaList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList(Arrays.asList("jjjjj", "yyyyy", "iiiii"));
		lista.add("Zoo");
		lista.add("Park");

		System.out.println("Numero de elementos:" + lista.size());
		System.out.println("For-each-------------------------");
		for (String dato : lista) {
			System.out.println(dato);
		}
		if (lista.contains("Zoo"))
			System.out.println("Contiene Zoo");
		System.out.println(lista.indexOf("Zoo"));

		System.out.println("For iterator----------------------------");
		for (Iterator<String> it = lista.iterator(); it.hasNext();) {
			String act = it.next();
			System.out.println(act);
			if (act.equals("Zoo")) {
				it.remove();
			}
		}
		System.out.println("For get-----------------------------------");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
