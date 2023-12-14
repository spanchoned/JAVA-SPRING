package com.informatorio.java.spring.dto;

import lombok.Data;

@Data
public class CancionDto {
    private String nombre;
    private int ranking;
    private int duracion;
    private int artistaId;
    private AlbumDto album;

}
