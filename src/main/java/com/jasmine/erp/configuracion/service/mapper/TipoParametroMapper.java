package com.jasmine.erp.configuracion.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jasmine.erp.configuracion.service.dto.TipoParametroDTO;
import com.jasmine.erp.entities.configuracion.TipoParametro;

@Mapper
public interface TipoParametroMapper {
	
	@Mapping(source = "tipoParametro.id", target = "id")
	@Mapping(source = "tipoParametro.nombre", target = "nombre")
	@Mapping(source = "tipoParametro.estado", target = "estado")
	TipoParametroDTO tipoParametroToTipoParametroDTO(TipoParametro tipoParametro);
	
	@Mapping(source = "tipoParametroDTO.id", target = "id")
	@Mapping(source = "tipoParametroDTO.nombre", target = "nombre")
	@Mapping(source = "tipoParametroDTO.estado", target = "estado")
	TipoParametro tipoParametroDTOToTipoParametro(TipoParametroDTO tipoParametroDTO);
	
	List<TipoParametroDTO> tipoParametrosToTipoParametrosDTO(List<TipoParametro> tipoParametros);
}
