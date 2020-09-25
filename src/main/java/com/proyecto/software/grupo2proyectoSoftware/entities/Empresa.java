package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.proyecto.software.grupo2proyectoSoftware.entities.Persona;
import com.proyecto.software.grupo2proyectoSoftware.entities.Producto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpresa;
	@Column(name = "razonSocial")
	private String razonSocial;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "cuil")
	private String cuil;
	@OneToMany(cascade = CascadeType.MERGE)
	private Set<Persona> lstPersonas = new HashSet<>();
	@OneToMany(cascade = CascadeType.MERGE)
	private Set<Producto> lstProductos = new HashSet<>();

	public Empresa() {
	}

	public Empresa(int idEmpresa, String razonSocial, String descripcion, String telefono, String cuil,
			Set<Persona> lstPersonas, Set<Producto> lstProductos) {
		super();
		this.idEmpresa = idEmpresa;
		this.razonSocial = razonSocial;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.cuil = cuil;
		this.lstPersonas = lstPersonas;
		this.lstProductos = lstProductos;
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

	public Set<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(Set<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	public Set<Producto> getLstProductos() {
		return lstProductos;
	}

	public void setLstProductos(Set<Producto> lstProductos) {
		this.lstProductos = lstProductos;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", razonSocial=" + razonSocial + ", descripcion=" + descripcion
				+ ", telefono=" + telefono + ", cuil=" + cuil + ", lstPersonas=" + lstPersonas + ", lstProductos="
				+ lstProductos + "]";
	}
	
	
	

}
