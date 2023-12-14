package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.Genero;
import com.informatorio.java.spring.service.genero.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.informatorio.java.spring.constants.ConstantsUtils.MESSAGE_201;
import static com.informatorio.java.spring.constants.ConstantsUtils.STATUS_201;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @PostMapping
    public ResponseEntity<String> crearGenero(@RequestBody Genero genero) {
        generoService.saveGenero(genero);
        return ResponseEntity.status(Integer.parseInt(STATUS_201)).body(MESSAGE_201);
    }

    @GetMapping("/{id}")
    public Genero obtenerGenero(@PathVariable int id) {
        return generoService.getGeneroById(id);
    }
}
