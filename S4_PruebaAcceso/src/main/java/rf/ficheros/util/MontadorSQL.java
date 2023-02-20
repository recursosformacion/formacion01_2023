package rf.ficheros.util;

public class MontadorSQL {

	/**
	 * Completa SQL Añadiendo el nombre del campo y su valor (si se pasa) Pensado
	 * para INSERT y UPDATES
	 * 
	 * @param salida
	 * @param nombreCampo
	 * @param valor
	 * @param separador
	 * @return Devuelve una string con los valores añadidos
	 */
	public static String addSalida(String salida, String nombreCampo, int valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "" + valor, separador);
	}

	public static String addSalida(String salida, String nombreCampo, double valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "" + valor, separador);
	}

	public static String addSalida(String salida, String nombreCampo, long valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "" + valor, separador);
	}

	public static String addSalida(String salida, String nombreCampo, String valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "'" + valor + "'", separador);
	}

	/**
	 * Recibe una String parcialmente construida y que tiene que completar, El
	 * nombre del campo se añade solo si no es nulo A continuacion del nombre del
	 * campo, se añade un signo "=" solo si se ha añadido nombre del campo a
	 * continuacion se añade el valor recibido
	 * 
	 * @param salida      : Parte de la string ya construida
	 * @param nombreCampo : Nombre del campo que se va a añadir
	 * @param valor       : Valor del campo
	 * @param separador   : Separador que se tiene que añadir entre campos
	 * @return : String que recibimos parcialmente construida a la que le hemos
	 *         añadido el nuevo campo
	 */
	public static String addSalidaSencilla(String salida, String nombreCampo, String valor, String separador) {
		if (salida.length() > 0)
			salida += separador + " ";
		if (nombreCampo != null && nombreCampo.compareTo("") > 0)
			salida += nombreCampo + " = ";
		salida += valor;
		return salida;
	}

}
