package com.proyecto.software.grupo2proyectoSoftware.ServicesImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.software.grupo2proyectoSoftware.converters.SubCategoriaConverter;
import com.proyecto.software.grupo2proyectoSoftware.entities.Subcategoria;
import com.proyecto.software.grupo2proyectoSoftware.models.SubCategoriaModel;
import com.proyecto.software.grupo2proyectoSoftware.repositories.ISubCategoriaRepository;
import com.proyecto.software.grupo2proyectoSoftware.services.ISubCategoriaService;

@Service
public class SubCategoriaService  implements ISubCategoriaService{
	

	@Autowired
	public ISubCategoriaRepository subcategoriaRepository;
	
	@Autowired
	public SubCategoriaConverter subcategoriaConverter;

	@Override
	public List<Subcategoria> getAll() {
		return subcategoriaRepository.findAll();
	}

	@Override
	public SubCategoriaModel findIdSubCategoria(int idSubCategoria) {
		
	return subcategoriaConverter.entityToModel(subcategoriaRepository.findIdSubCategoria(idSubCategoria));			
	}

	@Override
	public SubCategoriaModel insertOrUpdate(SubCategoriaModel subCategoria) {
		Subcategoria subcatego= subcategoriaRepository.save(subcategoriaConverter.modelToEntity(subCategoria));
		return subcategoriaConverter.entityToModel(subcatego);
	}

	@Override
	public boolean delete(int idSubCategoria) {
		try {
			subcategoriaRepository.deleteById(idSubCategoria);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
