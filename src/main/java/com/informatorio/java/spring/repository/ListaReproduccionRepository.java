package com.informatorio.java.spring.repository;


import com.informatorio.java.spring.dominio.ListaReproduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ListaReproduccionRepository extends JpaRepository<ListaReproduccion, Integer> {
    List<ListaReproduccion> findByReproducirAleatoriamente(boolean reproducirAleatoriamente);


}
