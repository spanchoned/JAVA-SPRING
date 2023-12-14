package com.informatorio.java.spring.mapper;

import com.informatorio.java.spring.dominio.Genero;
import com.informatorio.java.spring.dto.GeneroDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GeneroMapper {

    @Mapping(target = "id", ignore = true)
    Genero toGenero(GeneroDto generoDto);
    GeneroDto toGeneroDto(Genero genero);
}
