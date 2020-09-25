package com.proyecto.software.grupo2proyectoSoftware.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVenta")
	private int idVenta;
	
	//private Pedido pedido;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clienteid" , referencedColumnName = "idPersona" )
	private Cliente cliente;
	
	@JoinColumn(name = "idvendedor", referencedColumnName = "idPersona")
	private Vendedor vendedor;
	
	private LocalDate fecha;
	private LocalTime hora;
	private double montoTotal;

	public Venta() {
		
	}
	
	public Venta(int idVenta, Cliente cliente, Vendedor vendedor, LocalDate fecha, LocalTime hora, double montoTotal) {
		this.idVenta = idVenta;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.fecha = fecha;
		this.hora = hora;
		this.montoTotal = montoTotal;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

}
