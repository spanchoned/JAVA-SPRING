package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.ListaReproduccion;
import com.informatorio.java.spring.service.listareproduccion.ListaReproduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/listas-reproduccion")
public class ListaReproduccionController {

    @Autowired
    private ListaReproduccionService listaReproduccionService;

    @PostMapping
    public ListaReproduccion crearListaReproduccion(@RequestBody ListaReproduccion listaReproduccion) {
        return listaReproduccionService.saveListaReproduccion(listaReproduccion);
    }

    @GetMapping("/{id}")
    public ListaReproduccion obtenerListaReproduccion(@PathVariable int id) {
        return listaReproduccionService.getListaReproduccionById(id);
    }


}
