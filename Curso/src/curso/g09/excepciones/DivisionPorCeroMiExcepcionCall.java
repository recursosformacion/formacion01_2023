package curso.g09.excepciones;

public class DivisionPorCeroMiExcepcionCall {

	public static void main(String[] args) {
		
		
		try {
			calcula();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void calcula() throws Exception {
		
		int a=0;
		int b=300;
		int c;
		
		if (a==0){
			throw new Exception("Se va producido un error");
		}
		
		try {
			c=b/a;
			System.out.println("El resultado es "+c);
		} catch (ArithmeticException e){
			throw new Exception("Se ha producido un error");
		} finally {
			System.out.println("Programa finalizado");
		}
		
		
		

	}

}
