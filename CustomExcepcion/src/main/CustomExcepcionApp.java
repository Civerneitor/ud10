package main;

import error.MiException;

public class CustomExcepcionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MiException a = new MiException();
		try {
			System.out.println("Creando exception");
			throw new MiException("Exception custom creado con éxito");
		}catch(MiException e) {
			System.out.println(e.getMessage());
		}
	}

}
