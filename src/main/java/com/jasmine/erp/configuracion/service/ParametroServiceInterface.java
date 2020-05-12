package com.jasmine.erp.configuracion.service;

import java.util.List;

import com.jasmine.erp.configuracion.service.dto.ParametroDTO;

public interface ParametroServiceInterface {

	/**
	 * Permite obtener un listado de parametros de acuerdo a el nombre de su tipo
	 * @return
	 */
	List<ParametroDTO> obtenerListaPorNombre(String nombre);
	
	/**
	 * Permite buscar un parametro en base a su id
	 * @return
	 */
	ParametroDTO buscarParametroPorID(Long id);
}
