package com.proyecto.software.grupo2proyectoSoftware.models;

public class VarianteModel {

	private int idVariante;
	private String talle;
	private String color;

	public VarianteModel() {
	}

	public VarianteModel(int idVariante, String talle, String color) {
		super();
		this.idVariante = idVariante;
		this.talle = talle;
		this.color = color;
	}

	public int getIdVariante() {
		return idVariante;
	}

	public void setIdVariante(int idVariante) {
		this.idVariante = idVariante;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
