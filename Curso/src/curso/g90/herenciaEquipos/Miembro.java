package curso.g90.herenciaEquipos;

import curso.utilidades.Viajante;

public class Miembro implements Viajante{
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	
	private static int contador=500;
	
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Miembro(int id, String nombre, String apellidos, int edad) {
		//setId(id);
		setId(contador++);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
	}
	
	public void concentrarse(){
		System.out.println(getNombre() + " dice: concentrado estoy!!!!!" );
	}
	public void viajar(){
		System.out.println(getNombre() + " dice: viajando voy!!!!!" );
	}
	public void pagar(int importe) {
		// TODO Auto-generated method stub
		System.out.println(getNombre() + "Estoy pagando");
	}
	
}
