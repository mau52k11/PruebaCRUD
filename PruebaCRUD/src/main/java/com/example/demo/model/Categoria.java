package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name =  "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String codigo;
	private String descripcion;
	private boolean activo;
	
	
	
	
	
	
	
	public Categoria(long id, String codigo, String descripcion, boolean activo) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
	
}
