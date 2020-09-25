package com.proyecto.software.grupo2proyectoSoftware.ServicesImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.software.grupo2proyectoSoftware.converters.PromocionConverter;
import com.proyecto.software.grupo2proyectoSoftware.entities.Promocion;
import com.proyecto.software.grupo2proyectoSoftware.models.PromocionModel;
import com.proyecto.software.grupo2proyectoSoftware.repositories.IPromocionRepository;
import com.proyecto.software.grupo2proyectoSoftware.services.IPromocionService;


@Service
public class PromocionService implements  IPromocionService {

@Autowired
private IPromocionRepository promocionRepository;
@Autowired
private PromocionConverter promocionConverter;

	@Override
	public List<Promocion> getAll() {
		
		return promocionRepository.findAll();
	}

	@Override
	public PromocionModel findIdPromocion(int idPromocion) {
		
		return promocionConverter.entityToModel(promocionRepository.findIdPromocion(idPromocion));
	}

	@Override
	public PromocionModel insertOrUpdate(PromocionModel promocion) {
		Promocion promo= promocionRepository.save(promocionConverter.modelToEntity(promocion)); // Guarda la promo con el metodo de JPA
		return promocionConverter.entityToModel(promo);
	}

	@Override
	public boolean delete(int idPromocion) {
		try {
			promocionRepository.deleteById(idPromocion);;
			return true;
		} catch (Exception e) {
			return false;
	}

	}
}
	
	

