package curso.g07.funciones.p01;

import curso.utilidades.Consola;

/*
 * Realizar una funci�n, a la que se le pase como par�metro un n�mero N, y muestre por pantalla N
veces, el mensaje: �M�dulo ejecut�ndose�
























 */
public class Ejecutando {
	public static void main(String[] args) {
		int num;
		System.out.print("Introduzca un numero: ");
		num = Consola.entero();
		System.out.println("---------------------------");
		mostrar(num);
		System.out.println("---------------------------");
	}

	static void mostrar(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("M�dulo ejecut�ndose");
		}
	}
}
