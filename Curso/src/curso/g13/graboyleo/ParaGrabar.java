package curso.g13.graboyleo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ParaGrabar {

	public static void main(String[] args) throws IOException {
		FileWriter fiche = new FileWriter(".\\prueba");
		String nombre;
		String apellido;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Indica el nombre");
			nombre = entrada.nextLine();
			System.out.println("Indica el apellido");
			apellido = entrada.nextLine();
		}
		PrintWriter bw = new PrintWriter(fiche);
		bw.println("NOMBRE="+nombre);
		bw.println("APELLIDO="+apellido);
		bw.close();

	}

}
