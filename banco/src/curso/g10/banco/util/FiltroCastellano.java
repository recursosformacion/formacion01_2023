package curso.g10.banco.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

import org.hamcrest.core.IsNull;

/**
 * Conjunto de rutinas para filtrar los datos de la aplicacion de Bancos
 * 
 * @author migarcia
 *
 */
public class FiltroCastellano implements Filtros{

	
	
	/**
	 * Comprueba si el formato de entrada de fecha es correcto
	 * Se puede indicar el formato, o asumira "dd-MM-yyyy"
	 * @param fecha
	 * @param formato opcional
	 * @return LocalDate con la fecha, si es correcto o null
	 */
	public  LocalDate fechaCorrecta(String fecha) {
		return fechaCorrecta(fecha, "dd-MM-yyyy");
	}
	
}
