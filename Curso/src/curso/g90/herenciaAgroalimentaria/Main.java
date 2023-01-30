package curso.g90.herenciaAgroalimentaria;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Productos> lista = new ArrayList<Productos>();
		Calendar hoy = Calendar.getInstance();
		lista.add(new PRefrigerados(hoy,123,100));		
		lista.add(new PFrescos(hoy,125,hoy,"Espa�a"));
		lista.add(new PCAire(hoy,126,-50,20.0,30.0,40.0,10.0));
		lista.add(new PCAgua(hoy,123456,-30,20));
		lista.add(new PCNitrogeno(hoy,654321,-50,"Inmersion",20));
		
		Productos prrefri1 = new PRefrigerados(hoy,123,100);
		
		lista.forEach((pr) -> System.out.println(pr));
		

	}

}
