package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subcategoria {
	
@Id
	private int idSubCategoria;
	private String nombreSubCategoria;
	
	
	public Subcategoria() {
		
	}
	
	public Subcategoria(int idSubCategoria, String nombreSubCategoria) {
		super();
		this.idSubCategoria = idSubCategoria;
		this.nombreSubCategoria = nombreSubCategoria;
	}
	public int getIdSubCategoria() {
		return idSubCategoria;
	}
	public void setIdSubCategoria(int idSubCategoria) {
		this.idSubCategoria = idSubCategoria;
	}
	public String getNombreSubCategoria() {
		return nombreSubCategoria;
	}
	public void setNombreSubCategoria(String nombreSubCategoria) {
		this.nombreSubCategoria = nombreSubCategoria;
	}
	
	
	

}
