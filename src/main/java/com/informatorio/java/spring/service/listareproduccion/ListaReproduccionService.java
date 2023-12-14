package com.informatorio.java.spring.service.listareproduccion;

import com.informatorio.java.spring.dominio.ListaReproduccion;

public interface ListaReproduccionService {
    ListaReproduccion saveListaReproduccion(ListaReproduccion listaReproduccion);
    ListaReproduccion getListaReproduccionById(int listaReproduccionId);

}
