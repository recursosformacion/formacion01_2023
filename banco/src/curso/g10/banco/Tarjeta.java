package curso.g10.banco;

import java.time.LocalDate;

public abstract class Tarjeta {
	private String mNumero, mTitular;
	private LocalDate mFechaDeCaducidad;
	private Cuenta mCuentaAsociada;

	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}

	public Tarjeta(String numero, String titular, LocalDate fechaCaducidad) {
		mNumero = numero;
		mTitular = titular;
		mFechaDeCaducidad = LocalDate.from(fechaCaducidad);
	}

	public void setCuenta(Cuenta c) {
		mCuentaAsociada = c;
	}

	public abstract void retirar(double x) throws Exception;

	public abstract void ingresar(double x) throws Exception;

	public abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;

	public abstract double getSaldo();
}
