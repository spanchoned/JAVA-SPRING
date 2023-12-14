package com.informatorio.java.spring.service.listareproduccion;

import com.informatorio.java.spring.dominio.ListaReproduccion;
import org.springframework.stereotype.Service;

@Service
public class ListaReproduccionServiceImpl implements ListaReproduccionService {
    @Override
    public ListaReproduccion saveListaReproduccion(ListaReproduccion listaReproduccion) {
        return listaReproduccion;
    }

    @Override
    public ListaReproduccion getListaReproduccionById(int listaReproduccionId) {
        return null;
    }

    @Override
    public void agregarCancionALista(int listaReproduccionId, int cancionId, int creadorId) {

    }

    @Override
    public void eliminarCancionDeLista(int listaReproduccionId, int cancionId, int creadorId) {

    }


}