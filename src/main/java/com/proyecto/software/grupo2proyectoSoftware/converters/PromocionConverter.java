package com.proyecto.software.grupo2proyectoSoftware.converters;

import org.springframework.stereotype.Component;

import com.proyecto.software.grupo2proyectoSoftware.entities.Promocion;
import com.proyecto.software.grupo2proyectoSoftware.models.PromocionModel;

@Component
public class PromocionConverter {
	
	public Promocion modelToEntity(PromocionModel promocionmodel) {
		
		return new Promocion 
				(promocionmodel.getIdPromocion(),
				 promocionmodel.getDescuento());
		
	}
	
public PromocionModel entityToModel(Promocion promocion) {
		
		return new PromocionModel 
				(promocion.getIdPromocion(),
				 promocion.getDescuento());
		
	}
	

}
