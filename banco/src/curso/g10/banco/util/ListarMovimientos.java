package curso.g10.banco.util;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

import curso.g10.banco.Movimiento;

public class ListarMovimientos {

	public static  void print(String titulo, List<Movimiento> mMovimientos) {
		SimpleDateFormat fechaDma = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(titulo);
		double r = 0;
		DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for (Movimiento m : mMovimientos) {
			r += m.getImporte();
			
			System.out.println(dmy.format(m.getFecha()) + " "  + String.format("%-60s", m.getConcepto()) + "\t\t\t\t\t" + m.getImporte() + "\t" + r);
		}

	}
}
