package com.backend.main.entity.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "productos")
public class Producto {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idproducto;
	private String nombreproducto;
	private String descripcionproducto;
	private String imagenproducto;
	public Producto(String nombreproducto, String descripcionproducto, String imagenproducto) {
		super();
		this.nombreproducto = nombreproducto;
		this.descripcionproducto = descripcionproducto;
		this.imagenproducto = imagenproducto;
	}
	public Producto() {
		super();
	}
	public long getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public String getDescripcionproducto() {
		return descripcionproducto;
	}
	public void setDescripcionproducto(String descripcionproducto) {
		this.descripcionproducto = descripcionproducto;
	}
	public String getImagenproducto() {
		return imagenproducto;
	}
	public void setImagenproducto(String imagenproducto) {
		this.imagenproducto = imagenproducto;
	}
	
	
}
