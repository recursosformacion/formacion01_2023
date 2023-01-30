package curso.g08.clases.p01;

public class Usuario extends Persona
	implements Salvable {
	private String codigo;
	private String contraseña;
	private Object rol;
	
	
	public Object getRol() {
		return rol;
	}
	public void setRol(Object rol) {
		this.rol = rol;
	}
	Usuario(String codigo, String nombre,String contraseña){
		super(nombre);
		setCodigo(codigo);
		setContraseña(contraseña);
		Funciones.pgrabar(this);
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String aString() {
		
		return "Usuario:" + getCodigo() + "-->" + getNombre();
	}
	private int pruebaPrivado(){
		return 23;
	}
	@Override
	public void salvar() {
		System.out.println("Usuario salvado");
		
	}
	@Override
	public void leer() {
		// FIXME Auto-generated method stub
		System.out.println("Usuario leido");
		
	}
	public String toString(){
		
		return "usuario="+ super.toString()+" id:" + getCodigo();
		
	}
}
