package com.informatorio.java.spring.repository;

import com.informatorio.java.spring.dominio.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Integer> {

}
