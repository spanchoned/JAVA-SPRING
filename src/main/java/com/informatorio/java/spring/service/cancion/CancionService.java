package com.informatorio.java.spring.service.cancion;

import com.informatorio.java.spring.dominio.Cancion;

public interface CancionService {
    Cancion saveCancion(Cancion cancion);

    Cancion getCancionById(int cancionId);

    Cancion getRandomSong();


}