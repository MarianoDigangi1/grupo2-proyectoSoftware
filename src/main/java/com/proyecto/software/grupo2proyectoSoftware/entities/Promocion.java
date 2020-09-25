package com.proyecto.software.grupo2proyectoSoftware.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Promocion {
	
	@Id
	private int idPromocion;
	private List<Producto> lstProducto = new ArrayList<Producto>();
	private float descuento;
	
	
	public Promocion() {
		
	}
	
	public Promocion(int idPromocion, float descuento) {
		super();
		this.idPromocion = idPromocion;
		this.descuento = descuento;
	}
	public int getIdPromocion() {
		return idPromocion;
	}
	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}
	public List<Producto> getLstProducto() {
		return lstProducto;
	}
	public void setLstProducto(List<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	

}
