package com.informatorio.java.spring.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.*;
import java.util.List;
import jakarta.persistence.Column;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListaReproduccion extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "listaReproduccion", cascade = CascadeType.ALL)
    private List<Cancion> listaReproduccion;

    private String nombre;

    private boolean repetirLista;

    @Column(name = "reproducir_aleatoriamente")
    private boolean reproducirAleatoriamente;

    private boolean esPublica;

}