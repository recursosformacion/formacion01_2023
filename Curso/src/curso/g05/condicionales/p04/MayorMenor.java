package curso.g05.condicionales.p04;

public class MayorMenor {

	static int num1=10;
	static int num2=20;
	static int mayor;
	static int menor;
	
	public static void main(String[] args) {
		if (num1>num2) {
			System.out.println("Numero 1 mayor");
			mayor=num1;
			menor=num2;
		} else {
			mayor=num2;
			menor=num1;
			if (num1==num2) 
				System.out.println("Son iguales");
			else
				System.out.println("Num2 mayor que num1");
		}
		if (mayor%menor ==0)	
				System.out.println("Son multiplos");
		else
			System.out.println("No son multiplos");

	}

}
