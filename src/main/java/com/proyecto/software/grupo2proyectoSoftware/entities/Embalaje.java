package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Embalaje {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "idEmbalaje")
	private int idEmbalaje;
	
	@Column(name = "ancho")
	private double ancho;
	
	@Column(name = "alto")
	private double alto;
	
	@Column(name = "profundidad")
	private double profundidad;

	
	public Embalaje() {
		
	}
	
	public Embalaje(int idEmbalaje, double ancho, double alto, double profundidad) {
		this.idEmbalaje = idEmbalaje;
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
	}

	public int getIdEmbalaje() {
		return idEmbalaje;
	}

	public void setIdEmbalaje(int idEmbalaje) {
		this.idEmbalaje = idEmbalaje;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	
}
