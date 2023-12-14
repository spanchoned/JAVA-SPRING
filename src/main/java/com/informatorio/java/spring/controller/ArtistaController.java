package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.Artista;
import com.informatorio.java.spring.service.artista.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @PostMapping
    public Artista crearArtista(@RequestBody Artista artista) {
        return artistaService.saveArtista(artista);
    }

    @GetMapping("/{id}")
    public Artista obtenerArtista(@PathVariable int id) {
        return artistaService.getArtistaById(id);
    }


}
