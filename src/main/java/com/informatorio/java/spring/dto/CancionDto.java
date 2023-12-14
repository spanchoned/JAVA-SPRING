package com.informatorio.java.spring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancionDto {
    private String nombre;
    private int ranking;
    private int duracion;
    private int artistaId;
    private String album;

}
