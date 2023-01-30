package curso.g10.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import curso.g10.banco.exceptions.ErrorFiltro;
import curso.g10.banco.exceptions.SaldoInsuficiente;
import curso.g10.banco.util.FiltroCastellano;
import curso.g10.banco.util.FiltroEEUU;
import curso.g10.banco.util.Filtros;

import java.time.LocalDate;



class CuentaTest {
	
	Cuenta cta;
	
	
	Filtros asignado; 
	FiltrosInterface filtros;
	
	final String NUMERO_CTA = "1234567890";
	final String TITULAR = "qwaesrdtfygugihojpjk";
	final String TITULAR_ERR = "qwae";
	final double IMPORTE_m1 = -1;
	final double IMPORTE1000 = 1000.0;
	final double IMPORTE0500 = 500.0;
	final String CONCEPTO_OK = "Este concepto cumple con la normas de ser menor de 100";
	final String CONCEPTO_ERR = "Soy corto";
	
	@BeforeEach
	void inicio() {
		// asignado = new FiltroEEUU();
//		 asignado = Mockito.mock(FiltroEEUU.class);
//		Mockito.when(asignado.cumpleLongitud(TITULAR_ERR, Cuenta.TITULAR_MAX, Cuenta.TITULAR_MIN)).thenReturn(false);
//		Mockito.when(asignado.fechaCorrecta("10/12/2022")).thenReturn(LocalDate.now());
		asignado = new FiltroMokito();
		//creacion(castellano);
		cta = new Cuenta(NUMERO_CTA, TITULAR,asignado);
		
		
		FiltrosInterface filtros = Mockito.mock(FiltrosInterface.class);
		}
	
	@Test
	void testCuenta() {
		Assertions.assertThrows(ErrorFiltro.class, () -> {
			new Cuenta(NUMERO_CTA, TITULAR_ERR,asignado);
		});
	}

	@Test
	void testIngresarDouble() throws Exception {
		cta.ingresar(IMPORTE1000);
		assertEquals(IMPORTE1000,cta.getSaldo());
	}
	
	@Test
	void testIngresarDouble_1() throws Exception {
		Assertions.assertThrows(SaldoInsuficiente.class, () -> {
			cta.ingresar(IMPORTE_m1);
		});
	}

	@Test
	void testIngresarStringDouble() {
		cta.ingresar(CONCEPTO_OK, IMPORTE1000);
		assertEquals(IMPORTE1000,cta.getSaldo());
	}
	@Test
	void testIngresarStringDoubleERR() {
		Assertions.assertThrows(ErrorFiltro.class, () -> {
			cta.ingresar(CONCEPTO_ERR, IMPORTE1000);
		});
		
	}

	@Test
	void testRetirarDouble() throws Exception {
		cta.ingresar(IMPORTE1000);
		cta.retirar(IMPORTE0500);
		assertEquals(IMPORTE0500,cta.getSaldo());		
	}

	@Test
	void testRetirarStringDouble() throws Exception {
		cta.ingresar(IMPORTE1000);
		cta.retirar(CONCEPTO_OK, IMPORTE0500);
		assertEquals(IMPORTE0500,cta.getSaldo());	
	}

	@Test
	void testRetirarStringDoubleERR() {
		Assertions.assertThrows(SaldoInsuficiente.class, () -> {
			cta.retirar(CONCEPTO_ERR, IMPORTE1000);
		});
		
	}
	@Test
	void testRetirarStringDoubleERR_IMP() {
		Assertions.assertThrows(SaldoInsuficiente.class, () -> {
			cta.retirar(CONCEPTO_OK, IMPORTE_m1);
		});
		
	}
	

	

	void creacion(Filtros filtro) {
		cta = new Cuenta(NUMERO_CTA, TITULAR,filtro);
	}
}
