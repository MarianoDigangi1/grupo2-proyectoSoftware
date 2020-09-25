package com.proyecto.software.grupo2proyectoSoftware.models;

public class TablaParametrizableModel {

	private int idTabla;
	private double pesoEmbalaje;
	private double monto;

	public TablaParametrizableModel() {
	}

	public TablaParametrizableModel(int idTabla, double pesoEmbalaje, double monto) {
		super();
		this.idTabla = idTabla;
		this.pesoEmbalaje = pesoEmbalaje;
		this.monto = monto;
	}

	public int getIdTabla() {
		return idTabla;
	}

	public void setIdTabla(int idTabla) {
		this.idTabla = idTabla;
	}

	public double getPesoEmbalaje() {
		return pesoEmbalaje;
	}

	public void setPesoEmbalaje(double pesoEmbalaje) {
		this.pesoEmbalaje = pesoEmbalaje;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
}
