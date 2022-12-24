package curso.g90.herenciaEquipos;

public class Masajista extends Miembro {

	private String titulacion;
	private int aniosExperiencia;

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int niosExperiencia) {
		super(id, nombre, apellidos, edad);
		setTitulacion(titulacion);
		setAniosExperiencia(niosExperiencia);

	}

	public void darMasaje() {
		System.out.println(getNombre() + " dice: dado masaje!!!!!");
	}

}
