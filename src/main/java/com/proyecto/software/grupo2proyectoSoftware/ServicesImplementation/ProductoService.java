package com.proyecto.software.grupo2proyectoSoftware.ServicesImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.proyecto.software.grupo2proyectoSoftware.converters.ProductoConverter;
import com.proyecto.software.grupo2proyectoSoftware.entities.Producto;
import com.proyecto.software.grupo2proyectoSoftware.repositories.IProductoRepository;
import com.proyecto.software.grupo2proyectoSoftware.services.IProductoService;

@Service("productoService")
public class ProductoService implements IProductoService{

	@Autowired
	@Qualifier("productoRepository")
	private IProductoRepository productoRepository;
	
	@Autowired
	@Qualifier("productoConverter")
	private ProductoConverter productoConverter;

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}
	
}
