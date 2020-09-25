package com.proyecto.software.grupo2proyectoSoftware.models;

import java.util.ArrayList;
import java.util.List;

public class PromocionModel {

	private int idPromocion;
	private List<ProductoModel> lstProductos = new ArrayList<ProductoModel>();
	private float descuento;

	public PromocionModel() {

	};

	public PromocionModel(int idPromocion, float descuento) {
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

	public List<ProductoModel> getLstProdcutos() {
		return lstProductos;
	}

	public void setLstProdcutos(List<ProductoModel> lstProductos) {
		this.lstProductos = lstProductos;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

}
