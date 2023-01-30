package curso.g08.clases.p02;

public abstract class Vehiculo implements Abd{
	private String modelo;
	private int marchas;
	private double velocidad = 0;
	private String matricula;
	private String  chasis;
	private int ruedas;
	
	
	static int contador;

	static {
		contador=1500;
	}
	
	Vehiculo(){
		setMatricula("B-"+ ++contador);
	}
	
	Vehiculo(String modelo, int marchas){
		this();
		setModelo(modelo);
		setMarchas(marchas);
	}
	
	public Vehiculo(String modelo, int marchas, double velocidad, String matricula, String chasis, int ruedas) {
		this();
		this.modelo = modelo;
		this.marchas = marchas;
		this.velocidad = velocidad;
		this.matricula = matricula;
		this.chasis = chasis;
		this.ruedas = ruedas;
		AccesoABD dao = new AccesoABD();
		dao.AccesoGrabacion(this);
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMarchas() {
		return marchas;
	}
	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void leer() {
		//Convierte SQL a dominio
		
		
	}

	@Override
	public s grabar() {
		//Convierte dominio a sql
		
	}
	
	
}
