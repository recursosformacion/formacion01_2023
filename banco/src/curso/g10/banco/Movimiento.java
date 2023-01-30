package curso.g10.banco;

import java.time.LocalDate;

public class Movimiento {
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;

	public Movimiento() {
		mFecha = LocalDate.now();
	}

	public double getImporte() {
		return mImporte;
	}

	public String getConcepto() {
		return mConcepto;
	}

	public void setConcepto(String newMConcepto) {
		mConcepto = newMConcepto;
	}

	public LocalDate getFecha() {
		return mFecha;
	}

	public void setFecha(LocalDate newMFecha) {
		mFecha = newMFecha;
	}

	public void setImporte(double newMImporte) {
		mImporte = newMImporte;
	}
	@Override
	public String toString() {
		return "Movimiento [mConcepto=" + mConcepto + ", mFecha=" + mFecha + ", mImporte=" + mImporte + "]";
	}

}
