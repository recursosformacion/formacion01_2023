package curso.g00.cust;

public class Cust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pruebaInt = 12345678;
		
		char prc=(char) pruebaInt;
		float prf=pruebaInt;
		double prd = pruebaInt;
		short prs =(short) pruebaInt;
		byte prb = (byte) pruebaInt;
		System.out.println("int:"+pruebaInt);
		System.out.println("char:"+prc);
		System.out.println("float:"+prf);
		System.out.println("double:"+prd);
		System.out.println("short:"+prs);
		System.out.println("byte:"+prb);
	}
}
