package com.proyecto.software.grupo2proyectoSoftware.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente extends Persona {

	@Column(name = "cuil")
	private long cuil;

	public Cliente() {
	}

	public Cliente(int idPersona, String nombre, String apellido, long dni, LocalDate fechaNacimiento, String password,
			String username, long cuil) {
		super(idPersona, nombre, apellido, dni, fechaNacimiento, password, username);
		this.cuil = cuil;
		// TODO Auto-generated constructor stub
	}

	public long getCuil() {
		return cuil;
	}

	public void setCuil(long cuil) {
		this.cuil = cuil;
	}

}
