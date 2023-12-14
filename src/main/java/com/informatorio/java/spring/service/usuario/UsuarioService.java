package com.informatorio.java.spring.service.usuario;

import com.informatorio.java.spring.dominio.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    public Usuario saveUsuario(Usuario usuario) {
        return usuario;
    }

    public Usuario getUsuarioById(int usuarioId) {
        return null;
    }


}
