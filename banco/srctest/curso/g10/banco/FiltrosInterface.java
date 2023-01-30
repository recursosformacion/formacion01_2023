package curso.g10.banco;

import java.time.LocalDate;

public interface FiltrosInterface {
	public boolean cumpleLongitud(String texto, int maxLongitud, int minLongitud);
	public boolean filtroFechaAny(LocalDate fecha, int maxAny, int minAny);
}
