package com.mariouz.aeropuerto;

public class Main {
	public static void main(String[] args) {
		Avion avion =  new Avion();
		avion.setAerolinea("Interjet");
		avion.setCombustible(100);
		avion.setMotor("Rolls-Royce");
		avion.setNumero(1234);
		
		System.out.println(avion.getNumero()+" "+avion.getAerolinea());
	}
}
