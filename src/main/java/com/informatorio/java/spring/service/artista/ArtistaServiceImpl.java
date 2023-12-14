package com.informatorio.java.spring.service.artista;

import com.informatorio.java.spring.dominio.Artista;
import org.springframework.stereotype.Service;

@Service
public class ArtistaServiceImpl implements ArtistaService {
    @Override
    public Artista saveArtista(Artista artista) {
        return artista;
    }

    @Override
    public Artista getArtistaById(int artistaId) {
        return null;
    }


}