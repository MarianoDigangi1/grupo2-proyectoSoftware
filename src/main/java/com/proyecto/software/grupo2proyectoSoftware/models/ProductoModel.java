package com.proyecto.software.grupo2proyectoSoftware.models;

import java.util.ArrayList;
import java.util.List;

public class ProductoModel {

	private long SKU;
	private String nombre;
	private String descripcionCorto;
	private String descripcionLarga;
	private double precioUnitario;
	private CategoriaModel categoria;
	//private VarianteModel variante;
	//private List<ComentarioModel> lstCom = new ArrayList()<ComentarioModel>();
	
	public ProductoModel() {
	}

	public ProductoModel(long sKU, String nombre, String descripcionCorto, String descripcionLarga,
			double precioUnitario, CategoriaModel categoria) {
		super();
		SKU = sKU;
		this.nombre = nombre;
		this.descripcionCorto = descripcionCorto;
		this.descripcionLarga = descripcionLarga;
		this.precioUnitario = precioUnitario;
		this.categoria = categoria;
	}

	public long getSKU() {
		return SKU;
	}

	public void setSKU(long sKU) {
		SKU = sKU;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcionCorto() {
		return descripcionCorto;
	}

	public void setDescripcionCorto(String descripcionCorto) {
		this.descripcionCorto = descripcionCorto;
	}

	public String getDescripcionLarga() {
		return descripcionLarga;
	}

	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	
}