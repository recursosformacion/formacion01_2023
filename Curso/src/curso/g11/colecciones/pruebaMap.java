package curso.g11.colecciones;

import java.util.*;
import java.util.Map.Entry;

public class pruebaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> lista = new TreeMap<String, String>();
		
		lista.put("prime","Miguel");
		lista.put("segun","Antonio");

		System.out.println("Numero de elementos:" + lista.size());
		for (Entry dato : lista.entrySet()){
			System.out.println(dato);
		}

		TreeMap<Modelo,String> pruebas = new TreeMap<Modelo,String>();
		pruebas.put(new Modelo(1), "uno");
		pruebas.put(new Modelo(3), "uno");
		pruebas.put(new Modelo(2), "uno");
		pruebas.put(new Modelo(1), "uno");
		
		
		for (Entry dato : pruebas.entrySet()){
			System.out.println(dato);
		}
	}

}
