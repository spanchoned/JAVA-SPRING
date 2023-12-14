package com.informatorio.java.spring.mapper;

import com.informatorio.java.spring.dominio.Usuario;
import com.informatorio.java.spring.dto.UsuarioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    Usuario toUsuario(UsuarioDto usuarioDto);
    UsuarioDto toUsuarioDto(Usuario usuario);
}
