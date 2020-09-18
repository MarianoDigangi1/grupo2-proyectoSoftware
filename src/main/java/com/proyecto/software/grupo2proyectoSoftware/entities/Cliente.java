package com.proyecto.software.grupo2proyectoSoftware.entities;

import java.time.LocalDate;

public class Cliente  extends Persona{
	
	private long cuil;
	
	public Cliente () {
		
	}

	public Cliente(long cuil ,int idPersona, String nombre, String apellido, long dni, LocalDate fechaNacimiento, String password,
			String username, Domicilio domicilio) {
		super(idPersona, nombre, apellido, dni, fechaNacimiento, password, username, domicilio);
		this.cuil=cuil;
	}

	public long getCuil() {
		return cuil;
	}

	public void setCuil(long cuil) {
		this.cuil = cuil;
	}
	
	
	
	

}
