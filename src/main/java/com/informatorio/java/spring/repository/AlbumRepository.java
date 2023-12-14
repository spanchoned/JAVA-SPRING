package com.informatorio.java.spring.repository;

import com.informatorio.java.spring.dominio.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    void deleteById(Long id);
}
