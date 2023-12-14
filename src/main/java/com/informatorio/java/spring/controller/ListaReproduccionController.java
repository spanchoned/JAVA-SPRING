package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.ListaReproduccion;
import com.informatorio.java.spring.service.listareproduccion.ListaReproduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.informatorio.java.spring.constants.ConstantsUtils.MESSAGE_201;
import static com.informatorio.java.spring.constants.ConstantsUtils.STATUS_201;

@RestController
@RequestMapping("/listas-reproduccion")
public class ListaReproduccionController {

    @Autowired
    private ListaReproduccionService listaReproduccionService;

    @PostMapping
    public ResponseEntity<String> crearListaReproduccion(@RequestBody ListaReproduccion listaReproduccion) {
        listaReproduccionService.saveListaReproduccion(listaReproduccion);
        return ResponseEntity.status(Integer.parseInt(STATUS_201)).body(MESSAGE_201);
    }

    @GetMapping("/{id}")
    public ListaReproduccion obtenerListaReproduccion(@PathVariable int id) {
        return listaReproduccionService.getListaReproduccionById(id);
    }
}
