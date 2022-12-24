package curso.g10.junit0;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class CuentaTest {
	CuentaFake cuenta;
	final String NUMERO_CUENTA = "0001.0002.12.1234567890";
	final String NOMBRE_TITULAR = "Fulano de tal";
	final String NOMBRE_TITULAR2 = "Fulano de cual";
	final String CONCEPTO_INGRESOS = "Prueba de ingreso";

	@Before
	public void inicio() throws Exception {
		cuenta = new CuentaFake(NUMERO_CUENTA, NOMBRE_TITULAR);
	}

	@Test (expected = Exception.class)
	public void creacion() throws Exception{
		cuenta = new CuentaFake(null,null);
	}
	
	@Test (expected = Exception.class)
	public void creacion2() throws Exception{
		cuenta = new CuentaFake("","");
	}
	
	@Test
	public void testTitular() {
		cuenta.setmTitular(NOMBRE_TITULAR2);
		assertEquals(NOMBRE_TITULAR2, cuenta.getmTitular());
	}

	@Test
	public void testTitular2() {
		cuenta.setmTitular(NOMBRE_TITULAR2);
		assertNotEquals(NOMBRE_TITULAR, cuenta.getmTitular());
	}

	@Test
	public void testIngresar1000() throws Exception {
		cuenta.ingresar(1000);
		assertTrue(cuenta.getSaldo() == 1000.0);
	}
	
	@Test (expected = ImporteNegativo.class)
	public void testIngresar1000E() throws Exception {
		cuenta.ingresar(-1000);
		
	}

	@Test  (expected = Exception.class)
	public void testRetirar1000() throws Exception {
			cuenta.retirar(1000);
	}

	@Test  
	public void testRetirar1000OK() throws Exception {
		cuenta.ingresar(10000);
		cuenta.retirar(1000);
		assertEquals(9000, cuenta.getSaldo(), 0.01);
	}
	@Test  (expected = SaldoInsuficiente.class)
	public void testRetirar1000MAS() throws Exception {
		cuenta.ingresar(10000);
		cuenta.retirar(10001);
		
	}
	@Test
	public void testIngresoYRetirada() {
		try {
			cuenta.ingresar(1000.0);
			cuenta.retirar(300.0);
		} catch (Exception e) {
		}
		assertTrue(cuenta.getSaldo() == 700.0);
	}
	@Test
	public void testMovimientoIngreso() throws Exception {
		cuenta.ingresar(1000);
		Vector<Movimiento> res = cuenta.getmMovimiento();
		Movimiento m = res.get(0);
		assertEquals(Cuenta.INGRESO_EFECTIVO,m.getConcepto());
	}
	@Test
	public void testMovimientoIngresoConcepto() throws Exception {
		cuenta.ingresar(CONCEPTO_INGRESOS,1000);
		Vector<Movimiento> res = cuenta.getmMovimiento();
		Movimiento m = res.get(0);
		assertEquals(CONCEPTO_INGRESOS,m.getConcepto());
	}

}
