package com.proyecto.software.grupo2proyectoSoftware.models;

import java.util.ArrayList;
import java.util.List;



public class CategoriaModel {
	
	private int idCategoria;
	private String nombreCategoria;
	private List<SubCategoriaModel> lstsubCategoria = new ArrayList<SubCategoriaModel> ();
	
	public CategoriaModel() {
		
	}
	
	public CategoriaModel(int idCategoria, String nombreCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nombreCategoria =nombreCategoria;
		
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public List<SubCategoriaModel> getLstsubCategoria() {
		return lstsubCategoria;
	}
	public void setLstsubCategoria(List<SubCategoriaModel> lstsubCategoria) {
		this.lstsubCategoria = lstsubCategoria;
	}

}
