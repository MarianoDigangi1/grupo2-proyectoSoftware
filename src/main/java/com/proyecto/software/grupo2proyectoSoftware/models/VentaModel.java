package com.proyecto.software.grupo2proyectoSoftware.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

public class VentaModel {

	private int idVenta;
	// private Set<PedidoModel> lstPed = new HashSet<>;
	private ClienteModel clienteModel;
	private VendedorModel vendedorModel;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	private LocalTime hora;
	private double montoTotal;

	public VentaModel() {

	}

	public VentaModel(int idVenta, ClienteModel clienteModel, VendedorModel vendedorModel, LocalDate fecha,
			LocalTime hora, double montoTotal) {
		super();
		this.idVenta = idVenta;
		this.clienteModel = clienteModel;
		this.vendedorModel = vendedorModel;
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

	public ClienteModel getClienteModel() {
		return clienteModel;
	}

	public void setClienteModel(ClienteModel clienteModel) {
		this.clienteModel = clienteModel;
	}

	public VendedorModel getVendedorModel() {
		return vendedorModel;
	}

	public void setVendedorModel(VendedorModel vendedorModel) {
		this.vendedorModel = vendedorModel;
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
