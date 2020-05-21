package com.jasmine.erp.configuracion.service.mapper;

import com.jasmine.erp.configuracion.service.dto.TipoParametroDTO;
import com.jasmine.erp.entities.configuracion.TipoParametro;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-18T18:32:19-0500",
    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class TipoParametroMapperImpl implements TipoParametroMapper {

    @Override
    public TipoParametroDTO tipoParametroToTipoParametroDTO(TipoParametro tipoParametro) {
        if ( tipoParametro == null ) {
            return null;
        }

        TipoParametroDTO tipoParametroDTO = new TipoParametroDTO();

        tipoParametroDTO.setEstado( tipoParametro.getEstado() );
        tipoParametroDTO.setId( tipoParametro.getId() );
        tipoParametroDTO.setNombre( tipoParametro.getNombre() );

        return tipoParametroDTO;
    }

    @Override
    public TipoParametro tipoParametroDTOToTipoParametro(TipoParametroDTO tipoParametroDTO) {
        if ( tipoParametroDTO == null ) {
            return null;
        }

        TipoParametro tipoParametro = new TipoParametro();

        tipoParametro.setEstado( tipoParametroDTO.getEstado() );
        tipoParametro.setId( tipoParametroDTO.getId() );
        tipoParametro.setNombre( tipoParametroDTO.getNombre() );

        return tipoParametro;
    }

    @Override
    public List<TipoParametroDTO> tipoParametrosToTipoParametrosDTO(List<TipoParametro> tipoParametros) {
        if ( tipoParametros == null ) {
            return null;
        }

        List<TipoParametroDTO> list = new ArrayList<TipoParametroDTO>();
        for ( TipoParametro tipoParametro : tipoParametros ) {
            list.add( tipoParametroToTipoParametroDTO( tipoParametro ) );
        }

        return list;
    }
}
