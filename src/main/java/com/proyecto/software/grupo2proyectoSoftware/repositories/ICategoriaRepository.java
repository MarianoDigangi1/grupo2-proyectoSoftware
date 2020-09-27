package com.proyecto.software.grupo2proyectoSoftware.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.software.grupo2proyectoSoftware.entities.Categoria;


@Repository("categoriaRepository")
public interface ICategoriaRepository  extends JpaRepository <Categoria, Serializable>{
	
	public abstract Categoria findIdCategoria(int idCategoria);

}
