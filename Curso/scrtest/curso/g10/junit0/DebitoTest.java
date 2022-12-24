package curso.g10.junit0;

import static org.junit.Assert.*;

import java.util.Calendar;


import org.junit.Before;
import org.junit.Test;

public class DebitoTest {

	Debito tarjeta;
	Cuenta cuenta;

	final int SALDO_INICIAL_CUENTA = 1000;

	final String NOMBRE_CLIENTE_CUENTA = "Fulanito de tal";
	final String NOMBRE_CLIENTE_TARJETA = "Fulanito de tal y tal";
	final String NUMERO_CUENTA = "0001.0002.12.1234567890";
	final String NUMERO_TARJETA = "1234567890123456";
	final Calendar HOY = Calendar.getInstance();
	final double IMPORTE_RETIRAR = 300.00;
	final double IMPORTE_RETIRAR_CON_COMISION = 315;
	final double IMPORTE_INGRESO = 500;
	final String ESTABLECIMIENTO_1 = "Zara";
	final double IMPORTE_1 = 120.0;
	final String ESTABLECIMIENTO_2 = "El Corte Ingles";
	final double IMPORTE_2 = 320;

	@Before
	public void setUp() throws Exception {
		cuenta = new Cuenta(NUMERO_CUENTA, NOMBRE_CLIENTE_CUENTA);
		cuenta.ingresar(SALDO_INICIAL_CUENTA);

		Calendar fechaCaducidad = HOY.getInstance();
		fechaCaducidad.add(Calendar.YEAR, 4);
		tarjeta = new Debito(NUMERO_TARJETA, NOMBRE_CLIENTE_TARJETA, fechaCaducidad); // 1000
		tarjeta.setCuenta(cuenta);
	}

	@Test
	public void testInicioSaldoCuenta() {
		assertEquals(SALDO_INICIAL_CUENTA, cuenta.getSaldo(), 0.1);
	}

	@Test
	public void testInicioSaldoTarjeta() {
		assertEquals(SALDO_INICIAL_CUENTA, tarjeta.getSaldo(), 0.1);
	}

	@Test
	public void testInicioNombre() {
		assertEquals(NOMBRE_CLIENTE_TARJETA, tarjeta.getmTitular());
	}

	@Test
	public void testIngresar500() throws Exception {

		double saldoAnteriorCuenta = cuenta.getSaldo();
		double saldoAnteriorTarjeta = tarjeta.getSaldo();

		System.out.println(saldoAnteriorCuenta + "/" + saldoAnteriorTarjeta);
		System.out.println(tarjeta.getSaldo());
		tarjeta.ingresar(IMPORTE_INGRESO);
		assertEquals(saldoAnteriorCuenta + IMPORTE_INGRESO, cuenta.getSaldo(), 0.1);

	}

	@Test
	public void testRetirar300() throws Exception {

		double saldoAnteriorCuenta = cuenta.getSaldo();

		tarjeta.retirar(IMPORTE_RETIRAR);
		assertEquals(saldoAnteriorCuenta - IMPORTE_RETIRAR, cuenta.getSaldo(), 0.1);

	}

}
