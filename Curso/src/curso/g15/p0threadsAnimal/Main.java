package curso.g15.p0threadsAnimal;

public class Main {

	
		private static final Pato pato = new Pato();
	    private static final Cerdo cerdo = new Cerdo();
	 
	    public static void main(String[] args) {
	    	pato.start();
	    	cerdo.start();
	    }

	

}
