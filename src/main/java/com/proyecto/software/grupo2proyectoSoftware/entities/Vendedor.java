package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vendedor extends Persona {
	
	private int numeroLegajo;

	public Vendedor() {
		
	}

	public Vendedor(int numeroLegajo) {
		super();
		this.numeroLegajo = numeroLegajo;
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}
	
	
	
}
