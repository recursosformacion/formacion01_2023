package curso.g11.genericos;

public class IntercambioString {

	private String st1;
	private String st2;
	private String color;
	
	public IntercambioString(String st1, String st2) {
		super();
		setSt1(st1);
		setSt2(st2);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		//calculo de string a rgb
		this.color = "FF0000";
	}

	public String getSt1() {
		//calculo de RGB a string
		return st1;
	}
	public void setSt1(String st1) {
		this.st1 = st1;
	}
	public String getSt2() {
		return st2;
	}
	public void setSt2(String st2) {
		this.st2 = st2;
	}
	public void intercambio() {
		String temp = getSt1();
		setSt1(getSt2());
		setSt2(temp);
		//color="Red";
		setColor("Red");
	}
}
