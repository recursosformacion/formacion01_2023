package curso.g08.clases.p02;

public class PruebaCoches {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Negro","Ford",6);
		Coche c2 = new Coche("Blanco","Arosa", 5); 
		Coche c3 = new Coche("Verde","Peugeot",4);
		Coche c4 = c1;
		c1.activarReductora(false);
		c2.activarReductora(true);
		
		Vehiculo c5 = new Coche("Azul","Seat",4);
		Velocidad c6 = new Coche("Rojo","Set",6);
		
		
		if (c3 instanceof Velocidad)
			c3.incremento(Velocidad.MUCHA);
		
		
		c4.setColor("Amarillo");
		System.out.println("\nCoche 1 es:"+c1.toString());
		System.out.println("\nCoche 2 es:"+c2.toString());
		System.out.println("\nCoche 3 es:"+c3.toString());
		System.out.println("\nCoche 4 es:"+c4.toString());
		
	}
	

}
