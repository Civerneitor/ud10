/**
 * 
 */
package models;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Civerneitor
 *
 */
public class Ordenador {
	private int num;

	public Ordenador() {
		super();
		this.num = new Random().nextInt(500)+1;
		
	}
	public boolean validar() /*throws InputMismatchException*/{
		try {
			//if(o instanceof Integer) {
				//String x = JOptionPane.showInputDialog("Introduce el numero que ha pensado el ordenador a ver si lo adivinas");
			Scanner x = new Scanner(System.in);	
			int n = x.nextInt();
				if(n>num) {
					System.out.println("Es menor que "+n);
				}else if(n<num) {
					System.out.println("Es mayor que "+n);
				}else {
					System.out.println("¡Correcto!");
					return false;
				}
			//}else throw new InputMismatchException();
		}catch(InputMismatchException e) {
			System.out.println("No has introducido un numero. Error: "+e.getMessage());
		}
		return true;
	}
	
}
