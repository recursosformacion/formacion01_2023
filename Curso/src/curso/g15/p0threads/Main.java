package curso.g15.p0threads;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Mensaje m1= new Mensaje();
		Mensaje m2= new Mensaje();
		
		m1.setMensaje("Este mensaje es desde 1");
		m2.setMensaje("Este mensaje es desde 2");
		
		m1.start();
		m2.start();
		Thread.sleep(5000);
		m2.setMensaje("**********************");
	}

}
