package com.informatorio.java.spring.mapper;

import com.informatorio.java.spring.dominio.Cancion;
import com.informatorio.java.spring.dto.CancionDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CancionMapper {

    @Mapping(target = "id", ignore = true)
    Cancion toCancion(CancionDto cancionDto);

    CancionDto toCancionDto(Cancion cancion);
}
