package com.proyecto.software.grupo2proyectoSoftware.models;

public class ClienteModel extends PersonaModel {

	private long cuil;
	
	public ClienteModel() {
		
	}

	public ClienteModel(long cuil) {
		super();
		this.cuil = cuil;
	}

	public long getCuil() {
		return cuil;
	}

	public void setCuil(long cuil) {
		this.cuil = cuil;
	}
	
	
	
}
