package com.proyecto.software.grupo2proyectoSoftware.models;

public class DomicilioModel {

	private int idDomicilio;
	private String calle;
	private int numero;
	private String ciudad;
	private String provincia;
	private int codigoPostal;

	public DomicilioModel() {
	}

	public DomicilioModel(int idDomicilio, String calle, int numero, String ciudad, String provincia,
			int codigoPostal) {
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
