package com.proyecto.software.grupo2proyectoSoftware.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria {

	@Id
	private int idCategoria;
	private String nombreCategoria;
	private List<Subcategoria> lstsubCategoria = new ArrayList<Subcategoria> ();
	
	public Categoria() {
		
	}
	
	public Categoria(int idCategoria, String nombreCategoria) {
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
	public List<Subcategoria> getLstsubCategoria() {
		return lstsubCategoria;
	}
	public void setLstsubCategoria(List<Subcategoria> lstsubCategoria) {
		this.lstsubCategoria = lstsubCategoria;
	}
	
	
	
}
