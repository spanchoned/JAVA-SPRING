package com.informatorio.java.spring.service.artista;

import com.informatorio.java.spring.dominio.Artista;

public interface ArtistaService {
    Artista saveArtista(Artista artista);
    Artista getArtistaById(int artistaId);

}
