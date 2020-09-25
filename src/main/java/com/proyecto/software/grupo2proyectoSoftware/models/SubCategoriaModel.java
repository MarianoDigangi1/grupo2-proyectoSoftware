package com.proyecto.software.grupo2proyectoSoftware.models;

public class SubCategoriaModel {
	
	private int idSubCategoria;
	private String nombreSubCategoria;
	
	public SubCategoriaModel() {
		
	}
	
	public SubCategoriaModel(int idSubCategoria, String nombreSubCategoria) {
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
