package curso.utilidades;

import javax.swing.JOptionPane;

public class Consola3 {
	public static void main(String[] args) {


		String nombre=JOptionPane.showInputDialog("Como te llamas?") ;

		int edad=Integer.parseInt(JOptionPane.showInputDialog("Cuantos a�os tienes?")) ;
		JOptionPane.showMessageDialog(null, "hola "+nombre+" tienes "+edad+" a�os") ;


		}


		} 

