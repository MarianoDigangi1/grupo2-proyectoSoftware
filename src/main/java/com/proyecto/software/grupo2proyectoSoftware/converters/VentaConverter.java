package com.proyecto.software.grupo2proyectoSoftware.converters;

import org.springframework.stereotype.Component;

import com.proyecto.software.grupo2proyectoSoftware.entities.Venta;
import com.proyecto.software.grupo2proyectoSoftware.models.VentaModel;

@Component("ventaConverter")
public class VentaConverter {

	/*public Venta modelToEntity(VentaModel ventaModel) {
		return new Venta(ventaModel.getIdVenta(), ventaModel.getClienteModel(), ventaModel.getVendedorModel(),
				ventaModel.getFecha(), ventaModel.getHora(), ventaModel.getMontoTotal());

	}*/

	public VentaModel entityToModel(Venta venta) {
		return new VentaModel();
	}
}
