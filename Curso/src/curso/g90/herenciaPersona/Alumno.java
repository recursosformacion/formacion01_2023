package curso.g90.herenciaPersona;

import java.util.HashSet;
import java.util.Set;

public class Alumno extends Persona {

	private int curso;
	private Set<String> asignaturas;
	
	public Alumno(String codPersona, String nombre, int edad, String telContacto, int curso) {
		super(codPersona, nombre, edad, telContacto);
		this.curso = curso;
		this.asignaturas = new HashSet<String>();
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public Set<String> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<String> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void setAsignatura(String asignatura) {
		asignaturas.add(asignatura);
	}

	@Override
	public String toString() {
		return super.toString() + " Alumno [curso=" + curso + ", asignaturas=" + asignaturas + "]";
	}
	@Override
	public void mostrar() {
		System.out.println(toString());
	}
}
