package com.proyecto.software.grupo2proyectoSoftware.services;

import java.util.List;

import com.proyecto.software.grupo2proyectoSoftware.entities.Promocion;
import com.proyecto.software.grupo2proyectoSoftware.models.PromocionModel;

public interface IPromocionService {
	
	public List<Promocion> getAll(); //Trae la lista de promociones
	
	public PromocionModel findIdPromocion(int idPromocion); //Metodo para encontrar el ID ingresado.
	
	public PromocionModel insertOrUpdate(PromocionModel promocion);  //Se ingresa o modifica los atributos de la promocion
	
	public boolean delete (int idPromocion);
	

}
