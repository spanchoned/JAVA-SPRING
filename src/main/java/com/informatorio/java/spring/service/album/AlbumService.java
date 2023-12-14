package com.informatorio.java.spring.service.album;

import com.informatorio.java.spring.dominio.Album;
import java.util.List;

public interface AlbumService {
    List<Album> obtenerTodosLosAlbums();
    void eliminarAlbum(Long id);
    Album saveAlbum(Album album);
    Album getAlbumById(int albumId);
}