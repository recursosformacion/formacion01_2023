package curso.g10.banco;

import java.time.LocalDate;

public class Debito extends Tarjeta {
	
	public Debito(String numero, String titular, LocalDate fecha) {
		super(numero, titular, fecha);
	}

	public void retirar(double x) throws Exception {
		getmCuentaAsociada().retirar("Retirada en cajero autom�tico", x);
	}

	public void ingresar(double x) throws Exception {
		getmCuentaAsociada().ingresar("Ingreso en cajero autom�tico", x);
	}

	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		getmCuentaAsociada().retirar("Compra en :" + datos, x);
	}

	public double getSaldo() {
		return getmCuentaAsociada().getSaldo();
	}
}
