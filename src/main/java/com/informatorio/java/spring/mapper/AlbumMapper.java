package com.informatorio.java.spring.mapper;

import com.informatorio.java.spring.dominio.Album;
import com.informatorio.java.spring.dto.AlbumDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ArtistaMapper.class})
public interface AlbumMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "canciones", ignore = true)
    Album toAlbum(AlbumDto albumDto);

    AlbumDto toAlbumDto(Album album);
}
