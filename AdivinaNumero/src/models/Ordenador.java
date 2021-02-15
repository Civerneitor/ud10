/**
 * 
 */
package models;

import java.util.InputMismatchException;
import java.util.Random;

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
	public boolean validar(int n) {
		try {
			if(n>num) {
				System.out.println("Es menor que "+n);
			}else if(n<num) {
				System.out.println("Es mayor que "+n);
			}else {
				System.out.println("¡Correcto!");
				return false;
			}
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}
	
}
