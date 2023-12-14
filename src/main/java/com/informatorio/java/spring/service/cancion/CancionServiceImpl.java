package com.informatorio.java.spring.service.cancion;

import com.informatorio.java.spring.dominio.Cancion;
import org.springframework.stereotype.Service;

@Service
public class CancionServiceImpl implements CancionService {
    @Override
    public Cancion saveCancion(Cancion cancion) {
        return cancion;
    }

    @Override
    public Cancion getCancionById(int cancionId) {
        return null;
    }

}