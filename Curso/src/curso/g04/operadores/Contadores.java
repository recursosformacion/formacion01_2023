package curso.g04.operadores;

public class Contadores {

	public static void main(String[] args) {
		int valor=0;
		valor=23;
		valor+=10;
		System.out.println("Resultado a=" + --valor); //32
		System.out.println("Resultado b=" + ++valor); //33
		System.out.println("Resultado c=" + valor++); //33
		System.out.println("Resultado d=" + valor--);//34
		System.out.println("Resultado e=" + valor);//33
		l2();
	}

	public static void l2() {
		int a=1;
		int b=25;
		int c=0;
		if (a==b) {
			System.out.println("Es igual");
			System.out.println("a=b");
			c=123;
		} else {
			System.out.println("Esto no");
		}
		char[] valores=new char[10];
		String mensaje = "Esto es un mensaje de saludo";
		for(int i=0;i<valores.length;i++) {		
			valores[i]=mensaje.charAt(i);
			if (i==3) {
				valores[i]='x';
			}
		}
		for(char paso : valores) {
			System.out.println(paso);
		}
		
		
	}
}
