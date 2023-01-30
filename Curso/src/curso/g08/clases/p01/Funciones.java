package curso.g08.clases.p01;

public class Funciones {

	public static void pgrabar(Cosas per) {
		if (per instanceof Persona) {
			Persona rr = (Persona) per;
			per.aString();
		}
		if (per instanceof Cliente) {
			Cliente ss = (Cliente) per;
			ss.aString();
			
		}
		if (per instanceof Usuario) {
			Usuario ss = (Usuario) per;
			ss.aString();
			
		}
		
		
		
	}
}
