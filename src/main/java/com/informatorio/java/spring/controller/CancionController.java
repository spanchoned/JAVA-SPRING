package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.Cancion;
import com.informatorio.java.spring.service.cancion.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/canciones")
public class CancionController {

    @Autowired
    private CancionService cancionService;

    @PostMapping
    public Cancion crearCancion(@RequestBody Cancion cancion) {
        return cancionService.saveCancion(cancion);
    }

    @GetMapping("/{id}")
    public Cancion obtenerCancion(@PathVariable int id) {
        return cancionService.getCancionById(id);
    }


}
