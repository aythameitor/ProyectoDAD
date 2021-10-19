package com.backend.main.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombreempleado;
	private String descripcionempleado;
	private String imagenempleado;
	
	
	
	public Empleado() {
		
	}



	public Empleado(String nombreempleado, String descripcionempleado, String imagenempleado) {
		super();
		this.nombreempleado = nombreempleado;
		this.descripcionempleado = descripcionempleado;
		this.imagenempleado = imagenempleado;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombreempleado() {
		return nombreempleado;
	}



	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}



	public String getDescripcionempleado() {
		return descripcionempleado;
	}



	public void setDescripcionempleado(String descripcionempleado) {
		this.descripcionempleado = descripcionempleado;
	}



	public String getImagenempleado() {
		return imagenempleado;
	}



	public void setImagenempleado(String imagenempleado) {
		this.imagenempleado = imagenempleado;
	}
	
	
}
