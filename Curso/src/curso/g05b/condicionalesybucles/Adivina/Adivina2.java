package curso.g05b.condicionalesybucles.Adivina;

import java.util.Scanner;

public class Adivina2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int topeSup=1000;
		int topeInf=0;
		int miNum=0;
		String respuesta="";
		miNum=(int)(Math.random()*1000 +1);
		do{
			System.out.println("Numero:"+ miNum + "(M)ayor, Me(n)or, (F)in");
			respuesta=sc.nextLine();
			if (respuesta.equalsIgnoreCase("M"))
				topeInf=miNum;
			else
				topeSup=miNum;
			miNum=(int)((topeSup+topeInf)/2);
		} while (!respuesta.equalsIgnoreCase("F"));
		
				
	}

}
