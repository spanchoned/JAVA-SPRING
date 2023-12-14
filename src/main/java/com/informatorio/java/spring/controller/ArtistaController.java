package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.Artista;
import com.informatorio.java.spring.service.artista.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.informatorio.java.spring.constants.ConstantsUtils.MESSAGE_201;
import static com.informatorio.java.spring.constants.ConstantsUtils.STATUS_201;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @PostMapping
    public ResponseEntity<String> crearArtista(@RequestBody Artista artista) {
        artistaService.saveArtista(artista);
        return ResponseEntity.status(Integer.parseInt(STATUS_201)).body(MESSAGE_201);
    }

    @GetMapping("/{id}")
    public Artista obtenerArtista(@PathVariable int id) {
        return artistaService.getArtistaById(id);
    }
}
