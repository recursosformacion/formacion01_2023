package curso.g09.excepciones;

public class DivisionPorCeroMiExcepcion {

	public static void main(String[] args) throws MiExcepcion {
		int a=0;
		int b=300;
		int c;
		try {
			c=b/a;
			System.out.println("El resultado es "+c);
		} catch (ArithmeticException e){
			throw new MiExcepcion("Se ha producido un error");
		} finally {
			System.out.println("Programa finalizado");
		}
		
		
		

	}

}
