package curso.g10.banco.exceptions;

public class SaldoInsuficiente extends RuntimeException {
	
	public SaldoInsuficiente(){
		super("El saldo de la cuenta no es suficiente");
	}

	public SaldoInsuficiente(String mensaje){
		super(mensaje);
	}
}
