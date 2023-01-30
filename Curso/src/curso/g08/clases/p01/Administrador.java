package curso.g08.clases.p01;

public class Administrador implements Cosas{
	private int codAut;

	public int getCodAut() {
		Funciones.pgrabar(this);
		return codAut;
		
	}

	public void setCodAut(int codAut) {
		this.codAut = codAut;
	}

	@Override
	public String aString() {
		
		return "     khhkjhkjhk    ";
	}
}
