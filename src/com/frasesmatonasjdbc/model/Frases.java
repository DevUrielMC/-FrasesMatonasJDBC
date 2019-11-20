package com.frasesmatonasjdbc.model;

import java.sql.Date;

public class Frases {

	private String contenido;
	private int cantidad;
	private String fechaDesde;

	public String getContenido() {
		return this.contenido;

	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getCantidad() {
		return this.cantidad;

	}

	public void getCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaDesde() {
		return this.fechaDesde;

	}

	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

}
