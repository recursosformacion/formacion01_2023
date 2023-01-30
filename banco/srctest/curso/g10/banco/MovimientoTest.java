package curso.g10.banco;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	final int IMPORTE_1 = 100;
	final String CONCEPTO_1 = "Esto es un concepto de prueba";

	Movimiento mov;

	@BeforeEach
	void creacion() {
		mov = new Movimiento();
	}

	

	@Test
	void testGetImporte() {
		mov.setImporte(IMPORTE_1);
		assertEquals(IMPORTE_1, mov.getImporte());
	}

	@Test
	void testGetConcepto() {
		mov.setConcepto(CONCEPTO_1);
		assertEquals(CONCEPTO_1, mov.getConcepto());
	}

	@Test
	void testGetFecha() {
		LocalDate hoy = LocalDate.now();
		mov.setFecha(hoy);
		assertEquals(hoy, mov.getFecha());
	}

	

}
