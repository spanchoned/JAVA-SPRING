package com.informatorio.java.spring.repository;

import com.informatorio.java.spring.dominio.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancionRepository extends JpaRepository<Cancion, Integer> {

}
