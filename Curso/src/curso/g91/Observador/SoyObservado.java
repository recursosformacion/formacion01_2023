package curso.g91.Observador;

import java.util.Observable;

import curso.utilidades.ConsoleScan;

public class SoyObservado extends Observable {
	
	String entra;
	public void inicia(){
		
		ConsoleScan cc= new ConsoleScan();
		do {
			entra = cc.cadena();
			setChanged();
			notifyObservers();
		} 	while (entra!=null);
	}
	public String getEntra(){
		return entra;
	}
}
