package com.proyecto.software.grupo2proyectoSoftware.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idComentario")
	private int idComentario; //agregado 
	@Column(name = "titulo")
	private String titulo; 
	@Column(name = "comentario")
	private String comentario;
	@Column(name = "cantidad") ///////////////////////////////////////
	private Cliente cliente; 

	public Comentario() {
		super();
	}
	public Comentario(int idComentario, String titulo, String comentario, Cliente cliente) {
		super();
		this.idComentario = idComentario;
		this.titulo = titulo;
		this.comentario = comentario;
		this.cliente = cliente;
	}
	public int getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
