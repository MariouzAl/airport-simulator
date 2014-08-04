package com.mariouz.aeropuerto;

public class Main {
	public static void main(String[] args) {
		String aerolinea = "Interjet";
		String motor = "Rolls-Royce";
		int numero  = 12345;
		int combustible = 100;
		
		Avion avion =  new Avion(aerolinea,motor,numero,combustible);
		
		System.out.println(avion.getNumero()+" "+avion.getAerolinea());
	}
}
