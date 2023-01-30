package curso.g13.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ParaPath {

	public static void main(String[] args) {
		Path dir = Paths.get(".\\ParaPath.java").toAbsolutePath().normalize();
		System.out.println(dir.toString());
		System.out.println("getFileName    " + dir.getFileName());
		System.out.println("getName(0)    " + dir.getName(0));
		System.out.println("getName (1)   " + dir.getName(1));
		System.out.println("getNameCount    " + dir.getNameCount());
		System.out.println("getRoot   " + dir.getRoot());
		
		

	}

}
