package com.mariouz.aeropuerto;

public class Avion {
	private int numero ;
	private String aerolinea;
	private String motor;
	private int combustible;

	public Avion(String aerolinea, String motor, int numero, int combustible) {
		this.aerolinea=aerolinea;
		this.motor= motor;
		this.numero = numero;
		this.combustible= combustible;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
}
