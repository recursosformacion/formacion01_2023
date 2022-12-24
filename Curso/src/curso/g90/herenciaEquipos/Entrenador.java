package curso.g90.herenciaEquipos;

public class Entrenador extends Miembro {

	private String idFedeeracion;
	
	public String getIdFedeeracion() {
		return idFedeeracion;
	}

	public void setIdFedeeracion(String idFedeeracion) {
		this.idFedeeracion = idFedeeracion;
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		setIdFedeeracion(idFederacion);
	}
	
	public void dirigirPartido(){
		
			System.out.println(getNombre() + " dice: Dirigiendo partido!!!!!" );
		
	}
	public void dirigirEntrenamiento(){
		
		System.out.println(getNombre() + " dice: Dirigiendo entrenamiento!!!!!" );
	
}
}
