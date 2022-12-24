package curso.g10.junit0;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class MovimientoTest {

	Movimiento mvt;
	final Calendar FECHA_1 = Calendar.getInstance();
	final String CONCEPTO_1 = "Concepto para movimiento 1";
	final String CONCEPTO_2 = "Concepto para movimiento 2";
	final double IMPORTE_1 = 1234.56;
	final double IMPORTE_2 = 5678.90;

	@Before
	public void testMovimiento() {
		mvt = new Movimiento();
		mvt.setFecha(FECHA_1);
		mvt.setConcepto(CONCEPTO_1);
		mvt.setImporte(IMPORTE_1);
	}

	@Test
	public void testGetImporte() {
		assertEquals(IMPORTE_1, mvt.getImporte(),0.01);
	}

	@Test
	public void testGetConcepto() {
		assertEquals(CONCEPTO_1, mvt.getConcepto());
	}

	@Test
	public void testSetConcepto() {
		mvt.setConcepto(CONCEPTO_2);
		assertEquals(CONCEPTO_2, mvt.getConcepto());
	}

	@Test
	public void testGetFecha() {
		assertEquals(FECHA_1, mvt.getFecha());
	}

	@Test
	public void testSetFecha() {
		Calendar fecha2 = FECHA_1;
		fecha2.add(Calendar.DAY_OF_MONTH,5);
		mvt.setFecha(fecha2);
		assertEquals(fecha2, mvt.getFecha());
	}

	@Test
	public void testSetImporte() {
		mvt.setImporte(IMPORTE_2);
		assertEquals(IMPORTE_2, mvt.getImporte(),0.01);
	}

}
