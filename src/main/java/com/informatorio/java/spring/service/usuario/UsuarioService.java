package com.informatorio.java.spring.service.usuario;

import com.informatorio.java.spring.dominio.Usuario;

public interface UsuarioService {
    Usuario saveUsuario(Usuario usuario);
    Usuario getUsuarioById(int usuarioId);
}
