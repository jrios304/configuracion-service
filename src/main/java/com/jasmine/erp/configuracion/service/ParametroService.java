package com.jasmine.erp.configuracion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jasmine.erp.configuracion.service.dto.ParametroDTO;
import com.jasmine.erp.configuracion.service.mapper.ParametroMapper;
import com.jasmine.erp.entities.configuracion.Parametro;
import com.jasmine.erp.repositories.configuracion.ParametroRepository;

@Transactional
@Service
public class ParametroService implements ParametroServiceInterface{
	
	@Autowired
	ParametroRepository parametroRepository;
	@Autowired
	ParametroMapper parametroMapper;

	@Override
	public List<ParametroDTO> obtenerListaPorNombre(String nombre) {
		List<Parametro> listaParam = parametroRepository.findByNameTipoParametro(nombre);
		return parametroMapper.parametrosToParametrosDTO(listaParam);
	}

	@Override
	public ParametroDTO buscarParametroPorID(Long id) {
		Optional<Parametro> param = parametroRepository.findById(id);
		if(param.isPresent()) {
			return parametroMapper.parametroToParametroDTO(param.get());
		}
		return null;
	}
}
