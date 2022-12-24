package curso.utilidades;

import java.io.*;

public class Consola {
	static String inicializar() {
		String buzon = "";
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		try {
			buzon = teclado.readLine();
		} catch (Exception e) {
			System.out.append("Entrada incorrecta)");
		}
		return buzon;
	}

	public static  int entero() {
		int valor = Integer.parseInt(inicializar());
		return valor;
	}

	public static  double real() {
		double valor = Double.parseDouble(inicializar());

		return valor;
	}

	public static  String cadena() {
		String valor = inicializar();
		return valor;
	}

	public static  char caracter() {
		String valor = inicializar();
		return valor.charAt(0);
	}
}

/*
Para java, un InputStream es cualquier cosa de la que se leen bytes. 
Puede ser el teclado, un fichero, un socket, o cualquier otro dispositivo de entrada. 
Esto, por un lado es una ventaja. Si todas esas cosas son InputStream, podemos hacer c�digo que lea de ellas 
sin saber qu� estamos leyendo.


Para java, una clase Reader es una clase que lee caracteres. Esto se parece m�s a lo que queremos.
 Un Reader tiene m�todos para leer caracteres. Con esta clase ya podriamos trabajar. 
 La pena es que seguimos teniendo System.in, que es un InputStream y no un Reader.

�C�mo convertimos el System.in en Reader?. Hay una clase en java, la InputStreamReader,
 que nos hace esta conversi�n. Para obtener un Reader, �nicamente tenemos que instanciar un InputStreamReader
  pas�ndole en el constructor un InputStream. 
  
  Con la clase InputStreamReader podr�amos apa�arnos. La pega es que nos da los caracteres sueltos.
   Si estamos leyendo de teclado, el que usa el programa puede escribir 10 caracteres o 20 o 13.
    Si usamos InputStreamReader, como lee caracteres sueltos, Tenemos que decirle cu�ntos queremos
     (que no lo sabemos), o bien ir pidiendo de uno en uno hasta que no haya m�s.
  
 BufferedReader nos lea de golpe todo lo que ha escrito el usuario de nuestro programa y nos lo diera de un golpe.

*/