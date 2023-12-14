package com.informatorio.java.spring.service.usuario;

import com.informatorio.java.spring.dominio.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuario;
    }

    @Override
    public Usuario getUsuarioById(int usuarioId) {
        return null;
    }
}
