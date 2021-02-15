/**
 * 
 */
package main;
import models.Ordenador;
import javax.swing.JOptionPane;
/**
 * @author Civerneitor
 *
 */
public class adivinaNumeroApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordenador a = new Ordenador();
		boolean seguir = true;
		while(seguir) {
			//Object b = JOptionPane.showInputDialog("Introduce el numero que ha pensado el ordenador a ver si lo adivinas");
			seguir=a.validar();
			
		}
	}

}
