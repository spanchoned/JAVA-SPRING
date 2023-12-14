package com.informatorio.java.spring.repository;

import com.informatorio.java.spring.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
