package curso.g08.clases.p02;

public class AccesoABD {

	/**
	 * Reciben Coches, Motos, Cuadrados, Rectangulos, PCAire........
	 */
	public void AccesoLectura(Abd rece) {
		//Abre BBDD
		//Prepara SQL
		//EJECUta SQL
		rece.leer();
		System.out.println("Leido");
	}
	
	/**
	 * Reciben Coches, Motos, Cuadrados, Rectangulos, PCAire........
	 */
	public void AccesoGrabacion(Abd rece) {
		System.out.println("Grabado");
		
	}
}
