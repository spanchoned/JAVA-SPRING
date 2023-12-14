package com.informatorio.java.spring.service.album;

import com.informatorio.java.spring.dominio.Album;
import com.informatorio.java.spring.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> obtenerTodosLosAlbums() {
        return albumRepository.findAll();
    }


    @Override
    public void eliminarAlbum(Long id) {
        albumRepository.deleteById(id);
    }

    @Override
    public Album saveAlbum(Album album) {
        return null;
    }

    @Override
    public Album getAlbumById(int albumId) {
        return null;
    }
}
