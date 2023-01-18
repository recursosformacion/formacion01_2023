package curso.g04.operadores;

public class Operaciones {
	final static int IVA = 21;
	
	
	public static void main(String[] args) {
		int cantidad;
		int unidades;
		double precio;
		double importe;
		double iva;
		int total;
		
		
		cantidad=3;
		unidades=12;
		precio=5.40; 
		
		importe=cantidad*unidades*precio;
		iva=importe*IVA/100;
		total=(int)(importe + iva);
		
		System.out.println("cantidad\t=" + cantidad);
		System.out.println("unidades\t=" + unidades);
		System.out.println("precio\t\t=" + precio);
		
		System.out.println("Importe\t\t=" + importe);
		System.out.println("Iva\t\t="+ iva);
		System.out.println("Total\t\t="+ total+"  deberia ser:"+importe + iva);

	}

}
