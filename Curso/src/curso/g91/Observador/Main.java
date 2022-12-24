package curso.g91.Observador;

public class Main {

	public static void main(String[] args) {
		SoyObservado so = new SoyObservado();
		YoObservo yo = new YoObservo(so);
		so.inicia();

	}

}
