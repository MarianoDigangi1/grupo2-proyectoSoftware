package com.proyecto.software.grupo2proyectoSoftware.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.software.grupo2proyectoSoftware.entities.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Serializable>{

	public abstract Producto findById(long SKU);
	
}
