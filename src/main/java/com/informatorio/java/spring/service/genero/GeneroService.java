package com.informatorio.java.spring.service.genero;

import com.informatorio.java.spring.dominio.Genero;

public interface GeneroService {
    Genero saveGenero(Genero genero);
    Genero getGeneroById(int generoId);

}
