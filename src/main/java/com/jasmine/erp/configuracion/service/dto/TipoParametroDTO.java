package com.jasmine.erp.configuracion.service.dto;

import java.io.Serializable;

import com.jasmine.erp.configuracion.util.EstadoEnum;

public class TipoParametroDTO implements Serializable{

	private Long id;
	
	private String nombre;
	
	private EstadoEnum estado;
	
	//------------------------GETTER Y SETTER----------------------------------------------------

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the estado
	 */
	public EstadoEnum getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}
}
