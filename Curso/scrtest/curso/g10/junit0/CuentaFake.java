package curso.g10.junit0;

import java.util.Vector;

public class CuentaFake extends Cuenta {

	public CuentaFake(String numero, String titular) throws Exception {
		super(numero, titular);
	}
	public Vector<Movimiento> getmMovimiento(){
		return mMovimientos;
		
	}

}
