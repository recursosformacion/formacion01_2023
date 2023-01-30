package curso.g08.clases.p01;

public abstract class Persona implements Cosas {
	private int id;
	private String nombre;
	private String direccion;
	private String correoElectronico;
	
	
	public abstract String aString();
//	public String aString() {
//		return nombre + " " + direccion;
//	}
	
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	Persona(){}
	
	
	public Persona(String nombre){
		setNombre(nombre);
	}
	
	public void imprimirQuien(){
		System.out.println(nombre);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void crear() {
		System.out.println("Creando desde persona");
	}
	public void borrar() {
		System.out.println("borrando desde persona");
	}
	public void enviarMensaje() {
		System.out.println("Enviando desde persona");
	}
	
}
