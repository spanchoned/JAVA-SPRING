package com.informatorio.java.spring.mapper;

import com.informatorio.java.spring.dominio.ListaReproduccion;
import com.informatorio.java.spring.dto.ListaReproduccionDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ListaReproduccionMapper {

    @Mapping(target = "id", ignore = true)
    ListaReproduccion toListaReproduccion(ListaReproduccionDto listaReproduccionDto);
    ListaReproduccionDto toListaReproduccionDto(ListaReproduccion listaReproduccion);
}
