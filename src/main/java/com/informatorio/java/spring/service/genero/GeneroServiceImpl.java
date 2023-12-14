package com.informatorio.java.spring.service.genero;

import com.informatorio.java.spring.dominio.Genero;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImpl implements GeneroService {
    @Override
    public Genero saveGenero(Genero genero) {
        return genero;
    }

    @Override
    public Genero getGeneroById(int generoId) {
        return null;
    }


}