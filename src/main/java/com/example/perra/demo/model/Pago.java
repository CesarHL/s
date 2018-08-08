package com.example.perra.demo.model;

import java.io.Serializable;

public class Pago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String costoConcepto;

	private String descripcion;

	private Integer estado;

	public Pago() {
		super();
	}

	public Pago(Integer id, String costoConcepto, String descripcion, Integer estado) {
		super();
		this.id = id;
		this.costoConcepto = costoConcepto;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCostoConcepto() {
		return costoConcepto;
	}

	public void setCostoConcepto(String costoConcepto) {
		this.costoConcepto = costoConcepto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pago [id=" + id + ", costoConcepto=" + costoConcepto + ", descripcion=" + descripcion + ", estado="
				+ estado + "]";
	}

}
