package curso.utilidades;

public interface Persistencia {
	
	boolean EOF=true;
	
	public boolean grabar();
	public boolean leer();

}
