package com.proyecto.software.grupo2proyectoSoftware.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity   //////////Se crea la entidad con este nombre en la base de datos.
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //INCREMENTA EL ID AUTOMATICAMENTE EN LA BD.
	private int idPersona;
	private String nombre;
	private String apellido;
	private long dni;
	private LocalDate FechaNacimiento;
	private String password;
	private String username;
	private Domicilio domicilio;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	public Persona() {
		
	}


	public Persona(int idPersona, String nombre, String apellido, long dni, LocalDate fechaNacimiento, String password,
			String username, Domicilio domicilio) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		FechaNacimiento = fechaNacimiento;
		this.password = password;
		this.username = username;
		this.domicilio = domicilio;
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


	public Domicilio getDireccion() {
		return domicilio;
	}


	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	
	
	
}
