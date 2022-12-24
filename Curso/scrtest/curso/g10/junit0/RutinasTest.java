package curso.g10.junit0;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class RutinasTest {

	@Test
	public void testConvierteACalendar() {
		String ini="10/02/2017";
		Calendar fecha = Rutinas.convierteACalendar(ini);
		String out = Rutinas.convierteAString(fecha);
		assertEquals(ini, out);
	}

	@Test
	public void testConvierteACalendar1() {
		String ini="30/02/2017";
		Calendar fecha = Rutinas.convierteACalendar(ini);
		String out = Rutinas.convierteAString(fecha);
		assertNotEquals(ini, out);
	}
	
	@Test
	public void testConvierteACalendar2() {
		String ini="10/14/2017";
		Calendar fecha = Rutinas.convierteACalendar(ini);
		String out = Rutinas.convierteAString(fecha);
		assertNotEquals(ini, out);
	}
	
	@Test
	public void testConvierteACalendar3() {
		String ini="10/00/2017";
		Calendar fecha = Rutinas.convierteACalendar(ini);
		String out = Rutinas.convierteAString(fecha);
		assertNotEquals(ini, out);
	}
	
	@Test
	public void testConvierteACalendar4() {
		String ini="10/02/0000";
		Calendar fecha = Rutinas.convierteACalendar(ini);
		String out = Rutinas.convierteAString(fecha);
		assertNotEquals(ini, out);
	}
	
	@Test
	public void testConvierteACalendar5() {
		String ini="29/02/2004";
		Calendar fecha = Rutinas.convierteACalendar(ini);
		String out = Rutinas.convierteAString(fecha);
		assertEquals(ini, out);
	}

	@Test
	public void testConvierteACalendar6() {
		String ini="29/02/2000";
		Calendar fecha = Rutinas.convierteACalendar(ini);
		String out = Rutinas.convierteAString(fecha);
		assertEquals(ini, out);
	}
	
	@Test
	public void testConvierteACalendar7() {
		String ini=null;
		Calendar fecha = Rutinas.convierteACalendar(ini);
		String out = Rutinas.convierteAString(fecha);
		assertNotEquals(ini, out);
	}
	@Test
	public void testEsFechaLogica() {
		assertTrue(Rutinas.esFechaLogica("01/01/2000"));
	}

	@Test
	public void testEsFechaLogica1() {
		assertTrue(Rutinas.esFechaLogica("31/12/2017"));
	}
	
	@Test
	public void testEsFechaLogica3() {
		assertTrue(Rutinas.esFechaLogica("28/02/2000"));
	}
	
	@Test
	public void testEsFechaLogica4() {
		assertTrue(Rutinas.esFechaLogica("29/02/2000"));
	}
	
	@Test
	public void testEsFechaLogica5() {
		assertFalse(Rutinas.esFechaLogica("32/01/2000"));
	}
	
	@Test
	public void testEsFechaLogica6() {
		assertFalse(Rutinas.esFechaLogica("01/14/2000"));
	}
	
	@Test
	public void testEsFechaLogica7() {
		assertFalse(Rutinas.esFechaLogica(null));
	}
}
