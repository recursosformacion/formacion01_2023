package rf.ficheros.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class MontadorSQLTest {

	final String NOMBRE_CAMPO = "NombreCampo";
	final String NOMBRE_CAMPO2 = "OtroCampo";
	final int VALOR_INT = 20;
	final double VALOR_DOUBLE = 123.45;
	final long VALOR_LONG = 12345;
	final String VALOR_STRING = "Texto en cadena";
	
	final String SALIDA_UNO = "NombreCampo = 20";
	final String SALIDA_DOS = "NombreCampo = 123.45";
	final String SALIDA_TRES = "NombreCampo = 12345";
	final String SALIDA_CUATRO = "NombreCampo = 'Texto en cadena'";
	final String SALIDA_LARGA="NombreCampo = 20, OtroCampo = 'Texto en cadena'";
	
	@Test
	void salidaLarga() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_INT,",");
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO2,VALOR_STRING,",");
		assertEquals(SALIDA_LARGA.trim(), salida.trim());
	}
	@Test
	void testAddSalidaStringStringIntString() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_INT,",");
		assertEquals(SALIDA_UNO.trim(), salida.trim());
	}

	@Test
	void testAddSalidaStringStringDoubleString() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_DOUBLE,",");
		assertEquals(SALIDA_DOS.trim(), salida.trim());
	}

	@Test
	void testAddSalidaStringStringLongString() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_LONG,",");
		assertEquals(SALIDA_TRES.trim(), salida.trim());
	}

	@Test
	void testAddSalidaStringStringStringString() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_STRING,",");
		assertEquals(SALIDA_CUATRO.trim(), salida.trim());
	}

	

}
