package com.proyecto.software.grupo2proyectoSoftware.repositories;

import org.springframework.stereotype.Repository;

import com.proyecto.software.grupo2proyectoSoftware.entities.Producto;

@Repository
public interface IProductoService {

	public abstract Producto findById(long SKU);
}
