package es.rf.tienda.exception;

@SuppressWarnings("serial")
public class DomainException extends Exception {

	DomainException() {
		super("Error DomainException");
	}

	public DomainException(String msj) {

		super("Domain: " + msj);
	}

}
