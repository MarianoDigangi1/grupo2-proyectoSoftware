package com.proyecto.software.grupo2proyectoSoftware.services;

import java.util.List;

import com.proyecto.software.grupo2proyectoSoftware.entities.Categoria;
import com.proyecto.software.grupo2proyectoSoftware.models.CategoriaModel;



public interface ICategoriaService {
	
	public List<Categoria> getAll();
	
	public CategoriaModel findIdCategoria(int idCategoria); //Metodo para encontrar el ID ingresado.
	
	public CategoriaModel insertOrUpdate(CategoriaModel categoria);  //Se ingresa o modifica los atributos de la SubCategoria
	
	public boolean delete (int idCategoria);

}
