package com.informatorio.java.spring.service.listareproduccion;

import com.informatorio.java.spring.dominio.ListaReproduccion;
import java.util.List;

public interface ListaReproduccionService {
    ListaReproduccion saveListaReproduccion(ListaReproduccion listaReproduccion);
    ListaReproduccion getListaReproduccionById(int listaReproduccionId);
    List<ListaReproduccion> getPlaylistsToShuffle();
    void agregarCancionALista(int listaReproduccionId, int cancionId, int creadorId);
    void eliminarCancionDeLista(int listaReproduccionId, int cancionId, int creadorId);

}
