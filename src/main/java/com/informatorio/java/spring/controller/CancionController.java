package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.Cancion;
import com.informatorio.java.spring.service.cancion.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.informatorio.java.spring.constants.ConstantsUtils.MESSAGE_201;
import static com.informatorio.java.spring.constants.ConstantsUtils.STATUS_201;

@RestController
@RequestMapping("/canciones")
public class CancionController {

    @Autowired
    private CancionService cancionService;

    @PostMapping
    public ResponseEntity<String> crearCancion(@RequestBody Cancion cancion) {
        cancionService.saveCancion(cancion);
        return ResponseEntity.status(Integer.parseInt(STATUS_201)).body(MESSAGE_201);
    }

    @GetMapping("/{id}")
    public Cancion obtenerCancion(@PathVariable int id) {
        return cancionService.getCancionById(id);
    }
}
