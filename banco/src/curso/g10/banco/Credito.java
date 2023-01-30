package curso.g10.banco;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import curso.g10.banco.util.ListarMovimientos;

import java.io.Serializable;
import java.time.LocalDate;

public class Credito extends Tarjeta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double mCredito;
	private Vector<Movimiento> mMovimientos;

	public static final double COMISION = 0.05;
	public static final double MINIMO_COMISION = 3.0;

	private LocalDate fMovimiento = LocalDate.now();

	public Credito(String numero, String titular, LocalDate fechaCaducidad, double credito) {
		super(numero, titular, fechaCaducidad);
		mCredito = credito;
		mMovimientos = new Vector<Movimiento>();
	}

	public void retirar(double x) throws Exception {
		if (x > 0) {
			x = x + (x * COMISION < MINIMO_COMISION ? MINIMO_COMISION : x * COMISION); // Añadimos una comisión de un
			// 5%,
			// mínimo de 3 euros.
			if (x > getCreditoDisponible())
				throw new Exception("Crédito insuficiente");
			Movimiento m = new Movimiento();
			m.setFecha(getfMovimiento());
			m.setConcepto("Retirada en cajero automático");
			m.setImporte(-x);
			mMovimientos.addElement(m);
		}
	}

	public void ingresar(double x) throws Exception {
		Movimiento m = new Movimiento();
		m.setFecha(getfMovimiento());
		m.setConcepto("Ingreso en cuenta asociada (cajero autom�tico)");
		m.setImporte(x);
		mMovimientos.addElement(m);

	}

	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		Movimiento m = new Movimiento();
		m.setFecha(getfMovimiento());
		m.setConcepto("Compra a cr�dito en: " + datos);
		m.setImporte(x);
		mMovimientos.addElement(m);
	}

	public double getSaldo() {
		double r = 0.0;
		for (int i = 0; i < this.mMovimientos.size(); i++) {
			Movimiento m = (Movimiento) mMovimientos.elementAt(i);
			r += m.getImporte();
		}
		return r + getmCredito();
	}

	public double getCreditoDisponible() {
		return mCredito + getSaldo();
	}

	public void liquidar(int mes, int año) {
		Movimiento liq = new Movimiento();

		liq.setConcepto("Liquidación de operaciones tarj. crédito, " + mes + " de " + año);
		double r = 0.0;
//		for (int i = this.mMovimientos.size() - 1; i >= 0; i--) {
//			Movimiento m = (Movimiento) mMovimientos.elementAt(i);
//			if (m.getFecha().getMonthValue() == mes && m.getFecha().getYear() == año) {
//				r += m.getImporte();
//				mMovimientos.remove(i);
//			}
//		}

//		for (Iterator it = mMovimientos.iterator(); it.hasNext();) {
//			Movimiento m = (Movimiento) it.next();
//			if (m.getFecha().getMonthValue() == mes && m.getFecha().getYear() == año) {
//				r += m.getImporte();
//				it.remove();
//			}
//		}
		r = mMovimientos.stream()
				.filter(mov -> mov.getFecha().getMonthValue() == mes && mov.getFecha().getYear() == año)
				.map(mov -> mov.getImporte())
				.reduce(0d, (sub, ele) -> sub + ele);
		
		mMovimientos = new Vector<Movimiento>( mMovimientos.stream()
				.filter(mov -> !(mov.getFecha().getMonthValue() == mes && mov.getFecha().getYear() == año))
				.collect(Collectors.toList()));
		
		liq.setFecha(LocalDate.of(año, mes, 27));
		liq.setImporte(r);
		if (r != 0)
			getmCuentaAsociada().addMovimiento(liq);
	}

	public double getmCredito() {
		return mCredito;
	}

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	public Vector<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(Vector<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}

	public LocalDate getfMovimiento() {
		return fMovimiento;
	}

	public void verMovimientos() {
		ListarMovimientos.print("*********************Listado movimientos credito******************", mMovimientos);

	}
}