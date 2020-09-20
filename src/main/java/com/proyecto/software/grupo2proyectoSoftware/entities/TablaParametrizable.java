package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TablaParametrizable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTabla" )
	private int idTabla;
	
	@Column(name = "pesoEmbalaje")
	private double pesoEmbalaje;
	
	@Column(name = "monto")
	private double monto;

	public TablaParametrizable() {
	}
	
	public TablaParametrizable(int idTabla, double pesoEmbalaje, double monto) {
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
