package com.jasmine.erp.configuracion.service.mapper;

import com.jasmine.erp.configuracion.service.dto.ParametroDTO;
import com.jasmine.erp.entities.configuracion.Parametro;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-18T18:32:19-0500",
    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class ParametroMapperImpl implements ParametroMapper {

    @Autowired
    private TipoParametroMapper tipoParametroMapper;

    @Override
    public ParametroDTO parametroToParametroDTO(Parametro parametro) {
        if ( parametro == null ) {
            return null;
        }

        ParametroDTO parametroDTO = new ParametroDTO();

        parametroDTO.setEstado( parametro.getEstado() );
        parametroDTO.setId( parametro.getId() );
        parametroDTO.setNombre( parametro.getNombre() );
        parametroDTO.setTipoParametro( tipoParametroMapper.tipoParametroToTipoParametroDTO( parametro.getTipoParametro() ) );

        return parametroDTO;
    }

    @Override
    public Parametro parametroDTOToParametro(ParametroDTO parametroDTO) {
        if ( parametroDTO == null ) {
            return null;
        }

        Parametro parametro = new Parametro();

        parametro.setEstado( parametroDTO.getEstado() );
        parametro.setId( parametroDTO.getId() );
        parametro.setNombre( parametroDTO.getNombre() );
        parametro.setTipoParametro( tipoParametroMapper.tipoParametroDTOToTipoParametro( parametroDTO.getTipoParametro() ) );

        return parametro;
    }

    @Override
    public List<ParametroDTO> parametrosToParametrosDTO(List<Parametro> parametros) {
        if ( parametros == null ) {
            return null;
        }

        List<ParametroDTO> list = new ArrayList<ParametroDTO>();
        for ( Parametro parametro : parametros ) {
            list.add( parametroToParametroDTO( parametro ) );
        }

        return list;
    }
}
