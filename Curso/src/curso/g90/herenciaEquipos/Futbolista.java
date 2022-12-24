package curso.g90.herenciaEquipos;

public class Futbolista extends Miembro {
	
	private int dorsal;
	private String demarcacion;
	
	
	

	public int getDorsal() {
		return dorsal;
	}




	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}




	public String getDemarcacion() {
		return demarcacion;
	}




	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}




	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		setDorsal(dorsal);
		setDemarcacion(demarcacion);
	}
	
	public void jugarPartido(){
		System.out.println(getNombre() + " dice: Juego partido!!!!!" );
	}

	public void entrenar(){
		System.out.println(getNombre() + " dice: Entrenando!!!!!" );
	}
}
