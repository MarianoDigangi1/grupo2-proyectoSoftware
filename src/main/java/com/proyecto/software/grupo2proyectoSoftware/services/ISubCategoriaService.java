package com.proyecto.software.grupo2proyectoSoftware.services;

import java.util.List;


import com.proyecto.software.grupo2proyectoSoftware.entities.Subcategoria;
import com.proyecto.software.grupo2proyectoSoftware.models.SubCategoriaModel;

public interface ISubCategoriaService {
	
public List<Subcategoria> getAll();
	
	public SubCategoriaModel findIdSubCategoria(int idSubCategoria); //Metodo para encontrar el ID ingresado.
	
	public SubCategoriaModel insertOrUpdate(SubCategoriaModel subCategoria);  //Se ingresa o modifica los atributos de la SubCategoria
	
	public boolean delete (int idSubCategoria);

}
