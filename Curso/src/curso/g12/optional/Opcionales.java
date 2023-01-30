package curso.g12.optional;

import java.util.Optional;

public class Opcionales {

	public static void main(String[] args) {
		
		String name = null;
		Optional<String> nameO = Optional.ofNullable(name);
		nameO.ifPresent(nombre->System.out.println(nombre.length()));
		System.out.println((Optional.ofNullable(name).orElse("PepitoGordo")));
		

	}

}
