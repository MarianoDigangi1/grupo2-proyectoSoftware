package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Variante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idVariante")
	private int idVariante;
	@Column(name="color")
	private String color;
	@Column(name="talle")
	private int talle;
	
	public Variante() {
		super();
	}
	public Variante(int idVariante, String color, int talle) {
		super();
		this.idVariante = idVariante;
		this.color = color;
		this.talle = talle;
	}
	public int getIdVariante() {
		return idVariante;
	}
	public void setIdVariante(int idVariante) {
		this.idVariante = idVariante;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTalle() {
		return talle;
	}
	public void setTalle(int talle) {
		this.talle = talle;
	}
}
