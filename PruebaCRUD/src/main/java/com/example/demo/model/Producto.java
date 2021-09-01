package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idproducto;
	private String codigo;
	private  String categoria;
	private  String codigobarra;
	private boolean activo;
	
	
	
	
	
	public Producto(long idproducto, String codigo, String categoria, String codigobarra, boolean activo) {
		super();
		this.idproducto = idproducto;
		this.codigo = codigo;
		this.categoria = categoria;
		this.codigobarra = codigobarra;
		this.activo = activo;
	}
	public long getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCodigobarra() {
		return codigobarra;
	}
	public void setCodigobarra(String codigobarra) {
		this.codigobarra = codigobarra;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
	
	
	

	
	
	

}
