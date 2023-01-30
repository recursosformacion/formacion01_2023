package curso.g10.banco.prueba;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import curso.g10.banco.Credito;
import curso.g10.banco.Cuenta;
import curso.g10.banco.Debito;
import curso.g10.banco.util.FiltroCastellano;
import curso.g10.banco.util.Filtros;

public class Main {

	static Cuenta c;
	static Debito tDebito;
	static Credito tCredito;
	public static void main(String[] args) throws Exception {
		LocalDate hoy = LocalDate.now();
		Filtros filtroAUtilizar = new FiltroCastellano();
		c=new Cuenta("123456","Miguel Garcia Garcia", filtroAUtilizar);

		c.ingresar(5000);
		c.ingresar("Para pruebas", 2000);
		c.retirar(200);
		c.retirar("Para mas pruebas",500);
		
		

		LocalDate fecha=LocalDate.now(); 
		fecha.plus(4l,ChronoUnit.YEARS);//	Caduca en 4 a�os
		tDebito=new Debito("1234567890123456", "Miguel Garcia", fecha);
		tDebito.setCuenta(c);
		tDebito.ingresar(80);
		tDebito.retirar(50);
		
		
		tCredito=new Credito("1234567890123456", "Miguel Garcia", fecha,50000);
		tCredito.setCuenta(c);
		tCredito.ingresar(87);
		tCredito.retirar(57);
		//System.out.println(tCredito.getSaldo());
		
		System.out.println("--------------------------Movimientos credito-------------------");
		tCredito.verMovimientos();
		
		
		tCredito.liquidar(hoy.getMonthValue(), hoy.getYear());
		
		
		
		System.out.println("--------------------------Movimientos-------------------");
		c.verMovimientos();

	}

}
