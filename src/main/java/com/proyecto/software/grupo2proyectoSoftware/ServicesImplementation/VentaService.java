package com.proyecto.software.grupo2proyectoSoftware.ServicesImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.proyecto.software.grupo2proyectoSoftware.converters.VentaConverter;
import com.proyecto.software.grupo2proyectoSoftware.entities.Venta;
import com.proyecto.software.grupo2proyectoSoftware.models.VentaModel;
import com.proyecto.software.grupo2proyectoSoftware.repositories.IVentaRepository;
import com.proyecto.software.grupo2proyectoSoftware.services.IVentaService;

@Service("ventaService")
public class VentaService implements IVentaService {

	@Autowired
	@Qualifier("ventaRepository")
	private IVentaRepository ventaRepository;
	
	@Autowired
	@Qualifier("ventaConverter")
	private VentaConverter ventaConverter;
	
	@Override
	public List<Venta> getAll() {
		// TODO Auto-generated method stub
		return ventaRepository.findAll();
	}

	@Override
	public VentaModel findById(int idVenta) {
		// TODO Auto-generated method stub
		return null;
	}

}
