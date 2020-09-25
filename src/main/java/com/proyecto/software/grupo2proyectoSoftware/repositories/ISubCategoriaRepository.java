package com.proyecto.software.grupo2proyectoSoftware.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.software.grupo2proyectoSoftware.entities.Subcategoria;
 // El repository interactua con entities y la BD

@Repository
public interface ISubCategoriaRepository extends JpaRepository <Subcategoria, Serializable>{
	
	public abstract Subcategoria findIdSubCategoria(int idSubcategoria);

}
