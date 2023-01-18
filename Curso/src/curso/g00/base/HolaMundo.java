package curso.g00.base;

public class HolaMundo {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo");
		char c='A';
		double precio=23.4;
		double iva=0.16;
		double importeTotal;
		importeTotal= precio*iva + precio;
		System.out.println("Caracter: " + c);
		System.out.println("Equivalencia Unicode: "+(int)c);
		System.out.println("Importe Total=: "+importeTotal);
		byte a = 100;
		short ss = a;
		a = (byte)ss;
		int importe = a;
		String valor = importe + "";
		importe = String.valueOf(valor);
		
				
	}

}
