package main;

import java.util.Random;

import error.MiException;

public class RandomExcepcionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MiException a = new MiException();
		try {
			System.out.println("Generando número aleatorio...");
			int i = new Random().nextInt(1000);
			System.out.println("El numero aleatorio generado es: "+i);
			throw new MiException(i);
		}catch(MiException e) {
			System.out.println(e.getMessage());
		}
	}

}
