package com.jasmine.erp.configuracion.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jasmine.erp.configuracion.service.dto.ParametroDTO;
import com.jasmine.erp.entities.configuracion.Parametro;

@Mapper(uses = TipoParametroMapper.class)
public interface ParametroMapper {
	
	@Mapping(source = "parametro.id", target = "id")
	@Mapping(source = "parametro.nombre", target = "nombre")
	@Mapping(source = "parametro.estado", target = "estado")
	@Mapping(source = "parametro.tipoParametro", target = "tipoParametro")
	ParametroDTO parametroToParametroDTO(Parametro parametro);
	
	@Mapping(source = "parametroDTO.id", target = "id")
	@Mapping(source = "parametroDTO.nombre", target = "nombre")
	@Mapping(source = "parametroDTO.estado", target = "estado")
	@Mapping(source = "parametroDTO.tipoParametro", target = "tipoParametro")
	Parametro parametroDTOToParametro(ParametroDTO parametroDTO);
	
	List<ParametroDTO> parametrosToParametrosDTO(List<Parametro> parametros);
}
