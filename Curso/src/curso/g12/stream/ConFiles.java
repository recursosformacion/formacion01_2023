package curso.g12.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConFiles {

	public static void main(String[] args) throws IOException {
		
//		Stream ficheros = Files.walk(Paths.get(".."));
//		ficheros
//		.filter(o -> o.toString().contains(".java"))		
//		.forEach(System.out::println);
		
		IntStream numeros = IntStream.range(1,20);
		numeros.forEach(System.out::println);
	}

}
