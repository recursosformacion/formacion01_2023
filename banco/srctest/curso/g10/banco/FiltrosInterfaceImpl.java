package curso.g10.banco;

import java.time.LocalDate;

import curso.g10.banco.util.Filtros;

public class FiltrosInterfaceImpl implements FiltrosInterface {

	@Override
	public boolean cumpleLongitud(String texto, int maxLongitud, int minLongitud) {
		
		return Filtros.cumpleLongitud(texto, maxLongitud, minLongitud);
	}

	@Override
	public boolean filtroFechaAny(LocalDate fecha, int maxAny, int minAny) {
		
		return Filtros.filtroFechaAny(fecha, maxAny, minAny);
	}

}
