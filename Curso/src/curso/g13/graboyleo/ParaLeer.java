package curso.g13.graboyleo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ParaLeer {

	public static void main(String[] args) throws IOException {
		
		File fiche = new File(".\\prueba");
		FileReader fr = new FileReader (fiche);
		BufferedReader br = new BufferedReader(fr);
		String nombre="";
		String apellido = "";
		String lectura="";
		
		while ((lectura = br.readLine()) != null) {			
			String dato[]=lectura.split("=");
			if (dato[0].equals("NOMBRE")) {
				nombre=dato[1];
			}
			if (dato[0].equals("APELLIDO")) {
				apellido=dato[1];
			}
		}
		System.out.println(nombre + " " + apellido);
		
		
	}
}
