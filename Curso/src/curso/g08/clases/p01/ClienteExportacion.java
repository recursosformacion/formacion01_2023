
package curso.g08.clases.p01;

public class ClienteExportacion extends Cliente {

	private String VAT;
	
	public ClienteExportacion(String nombre, String direccion, String correoElectronico, String VAT) {
		super();
		this.setNombre(nombre);
		this.setCorreoElectronico(correoElectronico);
		this.setVAT(VAT);
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}
	
	
}
