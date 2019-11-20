package com.frasesmatonasjdbc.model;

import java.util.Date;

public class Persona {
	private int idPersona;
	private String nombre;
	private int edad;
	private String carrera;
	private Date fecha;
	
	public int getIdPersona() {
		return this.idPersona;

	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return this.nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;

	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return this.carrera;

	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Date getFecha() {
		return this.fecha;

	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		return String.format("'%s',%d,'%s',nombre,edad,carrera");
	}
}
