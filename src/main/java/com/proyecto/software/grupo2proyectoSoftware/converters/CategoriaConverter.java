package com.proyecto.software.grupo2proyectoSoftware.converters;

import org.springframework.stereotype.Component;

import com.proyecto.software.grupo2proyectoSoftware.entities.Categoria;
import com.proyecto.software.grupo2proyectoSoftware.models.CategoriaModel;

@Component
public class CategoriaConverter {
	
	public Categoria modelToEntity(CategoriaModel categoriamodel) {
		return new Categoria
				(categoriamodel.getIdCategoria(),
				 categoriamodel.getNombreCategoria());
	}
	
	public CategoriaModel entityToModel(Categoria categoria) {
		return new CategoriaModel
				(categoria.getIdCategoria(),
				 categoria.getNombreCategoria());
	}
	

}
