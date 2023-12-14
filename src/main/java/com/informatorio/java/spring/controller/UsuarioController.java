package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.Usuario;
import com.informatorio.java.spring.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.informatorio.java.spring.constants.ConstantsUtils.MESSAGE_201;
import static com.informatorio.java.spring.constants.ConstantsUtils.STATUS_201;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> crearUsuario(@RequestBody Usuario usuario) {
        usuarioService.saveUsuario(usuario);
        return ResponseEntity.status(Integer.parseInt(STATUS_201)).body(MESSAGE_201);
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable int id) {
        return usuarioService.getUsuarioById(id);
    }
}
