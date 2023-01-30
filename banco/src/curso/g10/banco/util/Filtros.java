package curso.g10.banco.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

public interface Filtros {

	public default boolean lMax(String texto, int longitud) {
		return texto.length()<= longitud;
	}

	public default boolean lMin(String texto, int longitud) {
		return texto.length()>= longitud;
	}
	/**
	 * Control longitud string
	 * @param texto
	 * @param maxLongitud
	 * @param minLongitud
	 * @return
	 */
	public default boolean cumpleLongitud(String texto, int maxLongitud, int minLongitud) {
		return lMax(texto,maxLongitud) && lMin(texto,minLongitud);
	}

	public default boolean fMax(LocalDate fecha, LocalDate fMaxima) {
		return fecha.isBefore(fMaxima) || fecha.isEqual(fMaxima);
	}
	
	public default boolean fMin(LocalDate fecha, LocalDate fMinima) {
		return fecha.isAfter(fMinima) || fecha.isEqual(fMinima);
	}
	/**
	 * 
	 * @param fecha
	 * @param maxAny numero años incremento para maximo
	 * @param minAny numero NEGATIVO si se ha de restar a fecha actual
	 * @return
	 */
	public  default boolean filtroFechaAny(LocalDate fecha, int maxAny, int minAny) {
		if (null == fecha) {
			return false;
		}
		LocalDate hoy = LocalDate.now();
		LocalDate maxFech = hoy.plusYears(maxAny);
		LocalDate minFech = hoy.plusYears(minAny);
		return fMax(fecha,maxFech) && fMin(fecha,minFech);
	}
	
	public  LocalDate fechaCorrecta(String fecha);
	
	public default LocalDate fechaCorrecta(String fecha, String formato ) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        Optional<LocalDate> date = Optional.empty();
        try {
            date = Optional.of(LocalDate.parse(fecha, formatter));
            if(date.isPresent()) {
                return date.get();
            }
        } catch (DateTimeParseException e) {
        }   
        return null;
	}
}
