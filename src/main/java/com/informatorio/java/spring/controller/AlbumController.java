package com.informatorio.java.spring.controller;

import com.informatorio.java.spring.dominio.Album;
import com.informatorio.java.spring.service.album.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping
    public List<Album> obtenerTodosLosAlbums() {
        return albumService.obtenerTodosLosAlbums();
    }

    @GetMapping("/{id}")
    public Album obtenerAlbumPorId(@PathVariable Long id) {
        return albumService.getAlbumById(Math.toIntExact(id));
    }

    @PostMapping
    public Album guardarAlbum(@RequestBody Album album) {
        return albumService.saveAlbum(album);
    }

    @DeleteMapping("/{id}")
    public void eliminarAlbum(@PathVariable Long id) {
        albumService.eliminarAlbum(id);
    }
}
