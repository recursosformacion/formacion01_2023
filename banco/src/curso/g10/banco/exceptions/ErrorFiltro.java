package curso.g10.banco.exceptions;

public class ErrorFiltro extends RuntimeException {
	
	public ErrorFiltro(){
		super("Error Filtro");
	}

	public ErrorFiltro(String mensaje){
		super(mensaje);
	}
}
