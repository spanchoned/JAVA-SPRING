package com.informatorio.java.spring.repository;

import com.informatorio.java.spring.dominio.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CancionRepository extends JpaRepository<Cancion, Integer> {
    List<Cancion> findByGeneroNombre(String nombreGenero);
    List<Cancion> findByArtistaNombre(String nombreArtista);
    List<Cancion> findByAlbumNombre(String nombre);
    List<Cancion> findByTituloContaining(String titulo);

    @Query(value = "SELECT * FROM cancion ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Cancion findRandomSong();
}