package curso.g90.herenciaPersona;

public class Profesor extends Persona {

	private float salario;
	private String fecContratacion;
	public Profesor(String codPersona, String nombre, int edad, String telContacto, float salario,
			String fecContratacion) {
		super(codPersona, nombre, edad, telContacto);
		this.salario = salario;
		this.fecContratacion = fecContratacion;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getFecContratacion() {
		return fecContratacion;
	}
	public void setFecContratacion(String fecContratacion) {
		this.fecContratacion = fecContratacion;
	}
	@Override
	public String toString() {
		return super.toString() + " Profesor [salario=" + salario + ", fecContratacion=" + fecContratacion + "]";
	}
	
	@Override
	public void mostrar() {
		System.out.println(toString());
	}
	
}
