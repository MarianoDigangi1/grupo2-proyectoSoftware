package com.proyecto.software.grupo2proyectoSoftware.services;

import java.util.List;

import com.proyecto.software.grupo2proyectoSoftware.entities.Venta;
import com.proyecto.software.grupo2proyectoSoftware.models.VentaModel;

public interface IVentaService {

	public List<Venta> getAll();

	public VentaModel findById(int idVenta);

}
