package curso.g10.junit0;

import static org.junit.Assert.*;

import java.util.Calendar;
import org.junit.Before;
import org.junit.Test;

public class CreditoTest {

	Cuenta cuenta;
	Credito tarjeta;
	final int SALDO_INICIAL_CUENTA = 1000;
	final int SALDO_INICIAL_TARJETA = 5000;
	final String NOMBRE_CLIENTE_CUENTA = "Fulanito de tal";
	final String NOMBRE_CLIENTE_TARJETA = "Fulanito de tal y tal";
	final String NUMERO_CUENTA = "0001.0002.12.1234567890";
	final String NUMERO_TARJETA = "1234567890123456";
	final Calendar HOY = Calendar.getInstance();
	final double IMPORTE_RETIRAR = 300.00;
	final double IMPORTE_RETIRAR_CON_COMISION=315;
	final double IMPORTE_INGRESO=500;
	final String ESTABLECIMIENTO_1="Zara";
	final double IMPORTE_1=120.0;
	final String ESTABLECIMIENTO_2 = "El Corte Ingles";
	final double IMPORTE_2= 320;

	@Before
	public void setUp() throws Exception {
		cuenta = new Cuenta(NUMERO_CUENTA, NOMBRE_CLIENTE_CUENTA);
		cuenta.ingresar(SALDO_INICIAL_CUENTA);

		Calendar fechaCaducidad = HOY.getInstance();
		fechaCaducidad.add(Calendar.YEAR, 4);
		tarjeta = new Credito(NUMERO_TARJETA, NOMBRE_CLIENTE_TARJETA, fechaCaducidad, SALDO_INICIAL_TARJETA); // 1000
		tarjeta.setCuenta(cuenta);
	}

	@Test
	public void testInicioSaldoCuenta() {
		assertEquals(SALDO_INICIAL_CUENTA, cuenta.getSaldo(), 0.1);
	}

	@Test
	public void testInicioSaldoTarjeta() {
		assertEquals(SALDO_INICIAL_TARJETA, tarjeta.getSaldo(), 0.1);
	}

	@Test
	public void testInicioNombre() {
		assertEquals(NOMBRE_CLIENTE_TARJETA, tarjeta.getmTitular());
	}

	@Test
	public void testIngresar500() {
		try {
			double saldoAnteriorCuenta = cuenta.getSaldo();
			double saldoAnteriorTarjeta = tarjeta.getSaldo();
			double creditoAnterior = tarjeta.getCreditoDisponible();
			System.out.println(saldoAnteriorCuenta + "/" + saldoAnteriorTarjeta + "/" + creditoAnterior);
			System.out.println(tarjeta.getSaldo());
			tarjeta.ingresar(IMPORTE_INGRESO);
			assertEquals(saldoAnteriorCuenta, cuenta.getSaldo(), 0.1);
			assertEquals(creditoAnterior + IMPORTE_INGRESO, tarjeta.getCreditoDisponible(), 0.1);
		} catch (Exception e) {
		}
	}

	@Test
	public void testRetirar300() throws Exception {

		double saldoAnteriorCuenta = cuenta.getSaldo();
		double saldoAnteriorTarjeta = tarjeta.getSaldo();
		double creditoAnterior = tarjeta.getCreditoDisponible();
		tarjeta.retirar(IMPORTE_RETIRAR);
		assertEquals(saldoAnteriorCuenta, cuenta.getSaldo(), 0.1);
		assertEquals(creditoAnterior - IMPORTE_RETIRAR_CON_COMISION, tarjeta.getCreditoDisponible(), 0.1);

	}

	@Test
	public void testLiquidar() throws Exception {
		
			double saldoAnteriorCuenta = cuenta.getSaldo();
			double saldoAnteriorTarjeta = tarjeta.getSaldo();
			tarjeta.pagoEnEstablecimiento(ESTABLECIMIENTO_1, IMPORTE_1);
			tarjeta.pagoEnEstablecimiento(ESTABLECIMIENTO_2, IMPORTE_2);
			int mes = HOY.get(Calendar.MONTH);
			int año = HOY.get(Calendar.YEAR);
			System.out.println(mes+"//"+año);
			tarjeta.liquidar(mes + 1, año);
			assertEquals(saldoAnteriorCuenta + IMPORTE_1 + IMPORTE_2, cuenta.getSaldo() , 0.1);
			assertEquals(saldoAnteriorTarjeta  ,tarjeta.getSaldo(),  0.1);
		
	}

}
