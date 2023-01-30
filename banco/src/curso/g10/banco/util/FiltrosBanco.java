package curso.g10.banco.util;

import curso.g10.banco.exceptions.ErrorFiltro;
import curso.g10.banco.exceptions.SaldoInsuficiente;

public class FiltrosBanco {
	final static int CONCEPTO_MAX = 100;
	final static int CONCEPTO_MIN = 10;
	
	public static boolean concepto(String texto, double importe) {
		Filtros emer = new FiltroCastellano();
		if (importe <= 0)
			throw new SaldoInsuficiente("No se puede ingresar una cantidad negativa");
		if (!emer.cumpleLongitud(texto, CONCEPTO_MAX, CONCEPTO_MIN)) {
			throw new ErrorFiltro("Error tamaño concepto");
		}
		return true;
	}
}
