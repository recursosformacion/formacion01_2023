package curso.g10.junit0;

import java.io.Serializable;
import java.util.Calendar;

public class Debito extends Tarjeta implements Serializable{
	/**
	 * 
	 */
	public static final String X_DEBITO = "DEBITO";
	
	private static final long serialVersionUID = 1L;

	public Debito(String numero, String titular, Calendar fecha) {
		super(numero, titular, fecha);
	}

	public void retirar(double x) throws Exception {
		getmCuentaAsociada().retirar(TextosBanco.RETIRADA_CAJERO, x);
	}

	public void ingresar(double x) throws Exception {
		getmCuentaAsociada().ingresar(TextosBanco.INGRESO_CAJERO, x);
	}

	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		getmCuentaAsociada().retirar("Compra en :" + datos, x);
	}

	public double getSaldo() {
		return getmCuentaAsociada().getSaldo();
	}
	public String toXML(){
		return Rutinas.etiquetar(X_DEBITO,super.toXML() );
		
	}
}
