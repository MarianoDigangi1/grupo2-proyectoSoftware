package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="envio")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) /*????????????*/
public class Envio {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)  /*Explicacion abajo*/
	@Column(name="idEnvio")
	private int idEnvio;
	
	//private Cliente cliente;
	
	@Column(name="unidadMedida")
	private String unidadMedidad;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Venta venta;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "tablaid" , referencedColumnName ="idTabla")
	private TablaParametrizable tablaParametrizable;
	
	@Column(name="costoEnvio", nullable = true)
	private double costoEnvio;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "embalajeid", referencedColumnName = "idEmbalaje")
	private Embalaje embalaje;
	
	
	
	/*
	 * @GeneratedValue(strategy= GenerationType.IDENTITY) --> id autoincrementado
	 * 
	 * nullable = true --> que puede ser null
	 * */
}
