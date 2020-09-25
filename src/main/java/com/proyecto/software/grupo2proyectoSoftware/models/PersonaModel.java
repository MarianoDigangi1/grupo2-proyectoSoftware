package com.proyecto.software.grupo2proyectoSoftware.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


public class PersonaModel {

	private int idPersona;
	private String nombre;
	private String apellido;
	private long dni;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate FechaNacimiento;
	private String password;
	private String username;
	private DomicilioModel domicilioModel;

	public PersonaModel() {
		super();
	}

	public PersonaModel(int idPersona, String nombre, String apellido, long dni, LocalDate fechaNacimiento,
			String password, String username, DomicilioModel domicilioModel) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		FechaNacimiento = fechaNacimiento;
		this.password = password;
		this.username = username;
		this.domicilioModel = domicilioModel;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public DomicilioModel getDomicilioModel() {
		return domicilioModel;
	}

	public void setDomicilioModel(DomicilioModel domicilioModel) {
		this.domicilioModel = domicilioModel;
	}

}
