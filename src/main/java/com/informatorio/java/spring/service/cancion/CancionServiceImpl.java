package com.informatorio.java.spring.service.cancion;

import com.informatorio.java.spring.dominio.Cancion;
import com.informatorio.java.spring.repository.CancionRepository;
import org.springframework.stereotype.Service;

@Service
public class CancionServiceImpl implements CancionService {
    private CancionRepository cancionRepository;

    @Override
    public Cancion saveCancion(Cancion cancion) {
        return cancion;
    }

    @Override
    public Cancion getCancionById(int cancionId) {
        return null;
    }

    @Override
    public Cancion getRandomSong() {
        return cancionRepository.findRandomSong();
    }

}