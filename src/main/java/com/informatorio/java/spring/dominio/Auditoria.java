package com.informatorio.java.spring.dominio;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date fecha;

    @Column(nullable = false)
    private String accion;

    @Column(length = 1000)
    private String descripcion;
}

