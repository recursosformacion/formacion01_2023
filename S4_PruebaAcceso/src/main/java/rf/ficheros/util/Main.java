package rf.ficheros.util;

import java.util.List;

import rf.ficheros.controller.CountryController;
import rf.ficheros.modelos.Country;

public class Main {

	public static void main(String[] args) throws Exception {
		
		CountryController cc = new CountryController();
		List<Country> ll=cc.leerTodos();
		listarCtr(ll);

		System.out.println("-----------------------------------------------------------");
		System.out.println(cc.leerUno("BR"));
		
		Country datos = cc.leerUno("BR");
		datos.setCountry_name("Lo He Modificado");
		System.out.println("Afectados:" + cc.actualizar(datos));
		
		System.out.println("-----------------------------------------------------------");
		System.out.println(cc.leerUno("BR"));
		
		Country datos1 = cc.leerUno("BR");
		System.out.println("Afectados borrando:" + cc.borrar(datos1));
		
		
		
	}

	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}
}
