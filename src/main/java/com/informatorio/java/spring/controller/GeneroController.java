package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.Genero;
import com.informatorio.java.spring.service.genero.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @PostMapping
    public Genero crearGenero(@RequestBody Genero genero) {
        return generoService.saveGenero(genero);
    }

    @GetMapping("/{id}")
    public Genero obtenerGenero(@PathVariable int id) {
        return generoService.getGeneroById(id);
    }


}
