package com.proyecto.software.grupo2proyectoSoftware.ServicesImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.software.grupo2proyectoSoftware.converters.CategoriaConverter;
import com.proyecto.software.grupo2proyectoSoftware.entities.Categoria;
import com.proyecto.software.grupo2proyectoSoftware.models.CategoriaModel;
import com.proyecto.software.grupo2proyectoSoftware.repositories.ICategoriaRepository;
import com.proyecto.software.grupo2proyectoSoftware.services.ICategoriaService;

@Service
public class CategoriaServices implements ICategoriaService {
	
	@Autowired
	public ICategoriaRepository categoriaRepository;
	
	@Autowired
	public CategoriaConverter categoriaConverter;

	@Override
	public List<Categoria> getAll() {
		
		return categoriaRepository.findAll();
	}

	@Override
	public CategoriaModel findIdCategoria(int idCategoria) {
		
		return categoriaConverter.entityToModel(categoriaRepository.findIdCategoria(idCategoria));
	}

	@Override
	public CategoriaModel insertOrUpdate(CategoriaModel categoria) {
		Categoria catego= categoriaRepository.save(categoriaConverter.modelToEntity(categoria));
		return categoriaConverter.entityToModel(catego);
	}

	@Override
	public boolean delete(int idCategoria) {
		try {
			categoriaRepository.deleteById(idCategoria);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

}
