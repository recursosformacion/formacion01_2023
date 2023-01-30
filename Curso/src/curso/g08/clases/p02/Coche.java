package curso.g08.clases.p02;

public class Coche extends Vehiculo implements Velocidad , Para4x4 {
	private String color;
	private boolean situacion4x4;
	
	
	Coche(){
		super();
	}
	
	Coche(String color,String modelo, int marchas){
		super(modelo,marchas);
		setColor(color);
		
		
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		if (situacion4x4) {
			this.color="Red";
		}
	}

	

	@Override
	public String toString() {
		return "Coche \nColor=\t" + getColor() + 
				"\nModelo=\t" + getModelo() +
				"\nMarchas=\t" + getMarchas() +
				"\nVelocidad=\t" + getVelocidad() + 
				"\nMatricula=\t" + getMatricula() ;
	}

	@Override
	public void incremento(int factor) {
		if (factor == Velocidad.MUCHA){
			System.out.println("Corro mucho");
		}
		
	}

	@Override
	public void activarReductora(boolean activar) {
		situacion4x4=activar;
		
		
	}
	
	
}
