package com.informatorio.java.spring.mapper;

import com.informatorio.java.spring.dto.CancionDto;
import com.informatorio.java.spring.dominio.Cancion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ArtistaMapper.class, AlbumMapper.class})
public interface CancionMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "artista.id", source = "cancionDto.artistaId"),
            @Mapping(target = "album", source = "cancionDto.album")
    })
    Cancion toCancion(CancionDto cancionDto);

    CancionDto toCancionDto(Cancion cancion);
}
