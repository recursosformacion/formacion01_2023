package curso.g05a.buclesanidados.p11.reloj;

import java.text.DecimalFormat;

public class Reloj {

	public static void main(String[] args) throws InterruptedException {
		for (int a = 0; a < 2; a++) {
			int dh = 0;
			int sh = 0;
			int mh = 0;
			 DecimalFormat myFormatter = new DecimalFormat("00");

			for (dh = 0; dh < 24; dh++) {

				for (mh = 0; mh < 60; mh++) {

					for (sh = 0; sh < 60; sh++) {
					
						System.out.println( myFormatter.format(dh) + ":" + 
								myFormatter.format(mh) + ":" + 
								myFormatter.format(sh));
						Thread.sleep(1000);

					}
				}
			}
			

		}
	}
}
