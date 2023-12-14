package com.informatorio.java.spring.repository;

import com.informatorio.java.spring.dominio.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero, Integer> {

}
