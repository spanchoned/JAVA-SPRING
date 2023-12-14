package com.informatorio.java.spring.repository;

import com.informatorio.java.spring.dominio.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CancionRepository extends JpaRepository<Cancion, Integer> {
    List<Cancion> findByGeneroNombre(String nombreGenero);
    List<Cancion> findByArtistaNombre(String nombreArtista);
    List<Cancion> findByAlbumNombre(String nombre);
    List<Cancion> findByTituloContaining(String titulo);
}