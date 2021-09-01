package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name =  "codigobarra")
public class Codigobarra {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idcodigobarra;
	
	private String codigo;
	private boolean activo;
	
	
	
	
	
	public Codigobarra(long idcodigobarra, String codigo, boolean activo) {
		super();
		this.idcodigobarra = idcodigobarra;
		this.codigo = codigo;
		this.activo = activo;
	}
	
	
	public long getIdcodigobarra() {
		return idcodigobarra;
	}
	public void setIdcodigobarra(long idcodigobarra) {
		this.idcodigobarra = idcodigobarra;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	
	
	

}
