package curso.g09.complementos.p02.clases;

import java.util.Calendar;

public class Main {
	final static String FECHA_INI = "01/12/2000";
	final static String FECHA_FIN="01/12/2016";
	final static String FECHA_MAXIMA="01/12/2015";
	final static String FECHA_MINIMA="01/12/2015";
	
	public static void main(String[] args) {
		CalendarDia cd = new CalendarDia();

		System.out.println(cd.hoy());
		System.out.println(cd.calendar2String(cd.aplazado(30)));
		Calendar f1 = cd.string2Calendar(FECHA_INI);
		Calendar f2 = cd.string2Calendar(FECHA_FIN);
		Calendar fmax = cd.string2Calendar(FECHA_MAXIMA);
		Calendar fmin = cd.string2Calendar(FECHA_MINIMA);
		System.out.println("Distancia entre "+FECHA_INI+ " y "+FECHA_FIN+" dias:"+ cd.distancia(f1, f2));
		System.out.println("Distancia OK entre "+FECHA_INI+ " y "+FECHA_FIN+" dias:"+ cd.distanciaOK(f1, f2));
		System.out.println(FECHA_INI+" Exede fecha "+FECHA_MAXIMA+ "=" + cd.filtrarFechaMax(fmax, FECHA_INI));
		System.out.println(FECHA_INI+" Exede fecha "+FECHA_MINIMA+ "=" + cd.filtrarFechaMin(fmin, FECHA_INI));
			
		

		

	}

}
