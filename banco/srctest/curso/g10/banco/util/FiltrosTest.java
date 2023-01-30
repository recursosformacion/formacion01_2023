package curso.g10.banco.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class FiltrosTest {
	final String TITULAR0 = "";
	final String TITULAR1 = "Este titular es de 21";
	
	final String FECHAOK = "12-10-1980";
	final String FECHAOKF = "12/10/1980";
	final String FECHAER = "12.10.1980";
	final String[] FECHAERS = {"12-10", "10-1980", "12101980", "ab-cd-ef", "12-10-23"};
	
	
	static Filtros filtros;
	
	@BeforeAll
	static void inicio() {
		filtros = new FiltroCastellano();
	}
	
	@Test
	void testLMaxPasa20() {
		assertFalse(filtros.lMax(TITULAR1, 20));		
	}
	@Test
	void testLMaxPasa21() {
		assertTrue(filtros.lMax(TITULAR1, 21));		
	}
	@Test
	void testLMaxPasa50() {
		assertTrue(filtros.lMax(TITULAR1, 50));		
	}
	@Test
	void testLMaxPasaVacio() {
		assertTrue(filtros.lMax(TITULAR0, 50));		
	}
	
	@Test
	void testLMinPasa22() {
		assertFalse(filtros.lMin(TITULAR1, 22));		
	}
	@Test
	void testLMinPasa21() {
		assertTrue(filtros.lMin(TITULAR1, 21));		
	}
	@Test
	void testLMinPasa50() {
		assertFalse(filtros.lMin(TITULAR1, 50));		
	}
	@Test
	void testLMinPasaVacio() {
		assertFalse(filtros.lMin(TITULAR0, 1));		
	}

	@Test
	void testCumpleLongitud21_10() {
		assertTrue(filtros.cumpleLongitud(TITULAR1, 21, 10));
	}
	@Test
	void testCumpleLongitud25_21() {
		assertTrue(filtros.cumpleLongitud(TITULAR1, 25, 21));
	}
	@Test
	void testCumpleLongitud25_22() {
		assertFalse(filtros.cumpleLongitud(TITULAR1, 25, 22));
	}
	@Test
	void testCumpleLongitud20_10() {
		assertFalse(filtros.cumpleLongitud(TITULAR1, 20, 10));
	}
	@Test
	void testCumpleLongitud10_5() {
		assertFalse(filtros.cumpleLongitud(TITULAR0,10, 5));
	}

	@Test
	void testFMax() {
		LocalDate hoy = LocalDate.now();
		LocalDate max = hoy.plusDays(1);
		assertTrue(filtros.fMax(hoy, max));
	}
	@Test
	void testFMax_1() {
		LocalDate hoy = LocalDate.now();
		LocalDate max = hoy.minusDays(1);
		assertFalse(filtros.fMax(hoy, max));
	}
	
	@Test
	void testFMax_0() {
		LocalDate hoy = LocalDate.now();		
		assertTrue(filtros.fMax(hoy, hoy));
	}

	

	@Test
	void testFMin() {
		LocalDate hoy = LocalDate.now();
		LocalDate min = hoy.minusDays(1);
		assertTrue(filtros.fMin(hoy, min));
	}
	@Test
	void testFMin_1() {
		LocalDate hoy = LocalDate.now();
		LocalDate min = hoy.plusDays(1);
		assertFalse(filtros.fMin(hoy, min));
	}
	
	@Test
	void testFMin_0() {
		LocalDate hoy = LocalDate.now();		
		assertTrue(filtros.fMin(hoy, hoy));
	}
	
	@Test
	void testFiltroFechaAny_1_0() {
		LocalDate hoy = LocalDate.now();	
		assertTrue(filtros.filtroFechaAny(hoy, 1, 0));
	}
	
	@Test
	void testFiltroFechaAny_1_m1() {
		LocalDate hoy = LocalDate.now();	
		assertTrue(filtros.filtroFechaAny(hoy, 1, -1));
	}

	@Test
	void testFiltroFechaAny_1_1() {
		LocalDate hoy = LocalDate.now();	
		assertFalse(filtros.filtroFechaAny(hoy, 1, 1));
	}
	@Test
	void testFiltroFechaAny_null() {
		LocalDate hoy = LocalDate.now();	
		assertFalse(filtros.filtroFechaAny(null, 1, 1));
	}
	
	@Test
	void testFechaStringOk() {
		assertEquals(filtros.fechaCorrecta(FECHAOK), LocalDate.of(1980, 10, 12));
	}
	
	@Test
	void testFechaStringOkF() {
		assertEquals(filtros.fechaCorrecta(FECHAOKF,"dd/MM/yyyy"), LocalDate.of(1980, 10, 12));
	}
	
	@Test
	void testFechaStringEr() {
		assertEquals(filtros.fechaCorrecta(FECHAER), null);
	}
	
	
	@RepeatedTest(value = 5, name = "Fechas string erroneas {currentRepetition}/{totalRepetitions}")
	void testFechaStringErronea(RepetitionInfo repetitionInfo) {
		String prueba = FECHAERS[repetitionInfo.getCurrentRepetition() - 1];
		assertEquals(filtros.fechaCorrecta(prueba), null);
	}
}
