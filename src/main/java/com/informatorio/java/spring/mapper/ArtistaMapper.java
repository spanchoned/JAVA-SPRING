package com.informatorio.java.spring.mapper;

import com.informatorio.java.spring.dominio.Artista;
import com.informatorio.java.spring.dto.ArtistaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArtistaMapper {

    @Mapping(target = "id", ignore = true)
    Artista toArtista(ArtistaDto artistaDto);

    ArtistaDto toArtistaDto(Artista artista);
}
