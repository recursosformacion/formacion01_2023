package curso.g91.Observador;

import java.util.Observable;

public class YoObservo implements java.util.Observer {

	public YoObservo(Observable model) {

		model.addObserver(this); // Conecta la Vista con el Modelo
	}

	public void update(Observable t, Object o) // Invocada desde el modelo
	{
		SoyObservado esto = (SoyObservado) t;
		System.out.println( esto.getEntra());
	}
}
