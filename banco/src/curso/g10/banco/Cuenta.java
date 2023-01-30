package curso.g10.banco;

import java.util.Arrays;
import java.util.Vector;

import curso.g10.banco.exceptions.ErrorFiltro;
import curso.g10.banco.exceptions.SaldoInsuficiente;
import curso.g10.banco.util.Filtros;
import curso.g10.banco.util.FiltrosBanco;
import curso.g10.banco.util.ListarMovimientos;

public class Cuenta {
	public final static int TITULAR_MAX = 40;
	public final static int TITULAR_MIN = 15;
	
	private String mNumero;
	private String mTitular;
	private Vector<Movimiento> mMovimientos;

	Filtros filtros;
	
	public Cuenta(String numero, String titular,Filtros filtro) throws ErrorFiltro {
		filtros = filtro;
		if (filtros.cumpleLongitud(titular, TITULAR_MAX, TITULAR_MIN)) {
			this.mNumero = numero;
			mTitular = titular;
			mMovimientos = new Vector<Movimiento>();
		} else
			throw new ErrorFiltro("Error tamaño titular");
	}
	public void setFiltro(Filtros rec) {
		filtros = rec;
	}

	public void ingresar(double x) throws Exception {
		ingresar("Ingreso en efectivo", x);
	}

	public void ingresar(String concepto, double x) throws SaldoInsuficiente {
		if (FiltrosBanco.concepto(concepto, x)) {
			addMovimiento(concepto, x);
		}
	}

	public void retirar(double x) throws Exception {
		retirar("Retirada de efectivo", x);
	}

	public void retirar(String concepto, double x) throws Exception {
		if (getSaldo() < x) {
			throw new SaldoInsuficiente("Saldo insuficiente");
		}
		if (FiltrosBanco.concepto(concepto, x)) {
			addMovimiento(concepto, -x);
		}
	}

	public double getSaldo() {
		double r = 0.0;

//		for (Movimiento m : mMovimientos) {
//			r += m.getImporte();
//		}
		
		r =   mMovimientos.stream()
				.map(mov -> mov.getImporte())
				.reduce(0d, (subtotal, element) -> subtotal + element);

		return r;
	}

	public void addMovimiento(String concepto, double importe) {
		Movimiento m = new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(importe);
		addMovimiento(m);
	}

	public void addMovimiento(Movimiento m) {
		mMovimientos.addElement(m);
	}

	public void verMovimientos() {
		ListarMovimientos.print("*********************Listado movimientos cuenta******************", mMovimientos);

	}
}