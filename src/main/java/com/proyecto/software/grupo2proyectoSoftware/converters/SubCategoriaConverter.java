package com.proyecto.software.grupo2proyectoSoftware.converters;


import org.springframework.stereotype.Component;

import com.proyecto.software.grupo2proyectoSoftware.entities.Subcategoria;
import com.proyecto.software.grupo2proyectoSoftware.models.SubCategoriaModel;

@Component
public class SubCategoriaConverter {
	
	
	public Subcategoria modelToEntity(SubCategoriaModel subcategoriamodel) {
		return new Subcategoria
				(subcategoriamodel.getIdSubCategoria(),
				 subcategoriamodel.getNombreSubCategoria());
	}
	
	public SubCategoriaModel entityToModel(Subcategoria subcategoria) {
		return new SubCategoriaModel
				(subcategoria.getIdSubCategoria(),
				 subcategoria.getNombreSubCategoria());
	}

}
