package curso.g88.juegocartas;

public class Carta {

	private String palo;
	private int numero;

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		String valor="" + getNumero();
		switch (this.getNumero()) {
		case 1:
			valor="As";
			break;
		case 11:
			valor="J";
			break;
		case 12:
			valor="Q";
			break;
		case 13:
			valor="K";
			break;	
		}
		return "Carta [palo=" + palo + ", numero=" + valor + "]";
	}

}
