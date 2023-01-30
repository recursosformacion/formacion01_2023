package curso.g10.banco;

import java.time.LocalDate;

import curso.g10.banco.util.FiltroEEUU;

public class FiltroMokito extends FiltroEEUU {

	
	public  boolean cumpleLongitud(String texto, int maxLongitud, int minLongitud) {
		return false;
	}
	public LocalDate fechaCorrecta(String fecha) {	
		return LocalDate.now();
	}
}
