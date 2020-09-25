package com.proyecto.software.grupo2proyectoSoftware.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SKU")
	private long SKU;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcionCorta")
	private String descripcionCorta;
	@Column(name = "descripcionLarga")
	private String descripcionLarga;
	@Column(name = "precioUnitario")
	private double precioUnitario;
	@Column(name = "categoria") 
	private Categoria categoria;
	@Column(name = "variante") 
	private Variante variante;
	@Column(name = "ls")
	private List<Comentario>lstCom;
	
	
	public Producto() {
		super();
	}

	public Producto(long sKU, String nombre, String descripcionCorta, String descripcionLarga, double precioUnitario,
			Categoria categoria, Variante variante, List<Comentario> lstCom) {
		super();
		SKU = sKU;
		this.nombre = nombre;
		this.descripcionCorta = descripcionCorta;
		this.descripcionLarga = descripcionLarga;
		this.precioUnitario = precioUnitario;
		this.categoria = categoria;
		this.variante = variante;
		this.lstCom = lstCom;
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

	public String getDescripcionCorta() {
		return descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {  //Necesito Categoria(Caro)
		this.categoria = categoria;
	}

	public Variante getVariante() {
		return variante;
	}

	public void setVariante(Variante variante) {
		this.variante = variante;
	}

	public List<Comentario> getLstCom() {
		return lstCom;
	}

	public void setLstCom(List<Comentario> lstCom) {
		this.lstCom = lstCom;
	}

}
