package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "domicilio")
public class Domicilio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDomicilio")
	private int idDomicilio;
	@Column(name = "calle")
	private String calle;
	@Column(name = "numero")
	private int numero;
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "provincia")
	private String provincia;
	@Column(name = "codigoPostal")
	private int codigoPostal;

	public Domicilio() {

	}

	public Domicilio(int idDomicilio, String calle, int numero, String ciudad, String provincia, int codigoPostal) {
		super();
		this.idDomicilio = idDomicilio;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}

	public int getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}