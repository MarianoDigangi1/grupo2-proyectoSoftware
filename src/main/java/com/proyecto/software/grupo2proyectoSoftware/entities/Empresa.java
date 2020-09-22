package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.proyecto.software.grupo2proyectoSoftware.entities.Persona;
import com.proyecto.software.grupo2proyectoSoftware.entities.Producto;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmpresa;
	private String razonSocial;
	private String descripcion;
	private String telefono;
	private String cuil;
	private List<Persona> lstPersonas;
	private List<Producto> lstProductos;
	
	public Empresa() {}

	public Empresa(int idEmpresa, String razonSocial, String descripcion, String telefono, String cuil) {
		super();
		this.idEmpresa = idEmpresa;
		this.razonSocial = razonSocial;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.cuil = cuil;
		this.lstPersonas = new ArrayList<Persona>();
		this.lstProductos = new ArrayList<Producto>();
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public List<Producto> getLstProductos() {
		return lstProductos;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", razonSocial=" + razonSocial + ", descripcion=" + descripcion
				+ ", telefono=" + telefono + ", cuil=" + cuil + ", lstPersonas=" + lstPersonas + ", lstProductos="
				+ lstProductos + "]";
	}

	
	
	
	
	
	
	

}
