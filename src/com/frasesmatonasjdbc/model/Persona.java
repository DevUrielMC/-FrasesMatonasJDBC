package com.frasesmatonasjdbc.model;

public class Persona {

	private String nombre;
	private byte edad;
	private String carrera;

	
	public String getNombre() {
		return this.nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return this.edad;

	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return this.carrera;

	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
