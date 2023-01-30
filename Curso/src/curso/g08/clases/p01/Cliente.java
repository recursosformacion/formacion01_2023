package curso.g08.clases.p01;

import java.util.Calendar;

public class Cliente extends Persona implements Salvable {
	private int numero;
	private Calendar fecAlta;
	private String nif;

	public Cliente(String nombre, int numero, String nif) {
		super();
		this.setNombre(nombre);
		this.numero = numero;
		this.nif = nif;
		Funciones.pgrabar(this);
	}
	
	public Cliente() {};
	
	public void setNombre(String nombre) {
		if (filtraNombre(nombre)) {
			super.setNombre(nombre);
		} //else
			//comunicar error
	}

	public boolean filtraNombre(String nombre) {
		if (nombre.length() > 20 && nombre.length() <= 50)
			return true;
		return false;
	}

	public Calendar getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(Calendar fecAlta) {
		this.fecAlta = fecAlta;
	}

	public void verFechaAlta() {
		System.out.println("Viendo fecha de alta cliente");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String aString() {
		String salida = super.aString();
		return "Cliente:" + getNif() + "-->" + salida;
	}

	@Override
	public void salvar() {

		System.out.println("Cliente salvado");

	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println("Cliente leido");

	}

}
