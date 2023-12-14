package com.informatorio.java.spring.bootstrap;

import com.informatorio.java.spring.dominio.*;
import com.informatorio.java.spring.service.artista.ArtistaService;
import com.informatorio.java.spring.service.cancion.CancionService;
import com.informatorio.java.spring.service.genero.GeneroService;
import com.informatorio.java.spring.service.listareproduccion.ListaReproduccionService;
import com.informatorio.java.spring.service.usuario.UsuarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final UsuarioService usuarioService;
    private final ListaReproduccionService listaReproduccionService;
    private final CancionService cancionService;
    private final GeneroService generoService;
    private final ArtistaService artistaService;

    public BootstrapData(UsuarioService usuarioService, ListaReproduccionService listaReproduccionService,
                         CancionService cancionService, GeneroService generoService, ArtistaService artistaService) {
        this.usuarioService = usuarioService;
        this.listaReproduccionService = listaReproduccionService;
        this.cancionService = cancionService;
        this.generoService = generoService;
        this.artistaService = artistaService;
    }

    @Override
    public void run(String... args) {
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {

        Usuario usuario = new Usuario();
        usuario.setNombre("Usuario de Ejemplo");
        usuario.setUsername("usuarioEjemplo");
        usuarioService.saveUsuario(usuario);

        ListaReproduccion listaReproduccion = new ListaReproduccion();
        listaReproduccion.setNombre("Lista de Ejemplo");
        listaReproduccionService.saveListaReproduccion(listaReproduccion);

        Cancion cancion = new Cancion();
        cancion.setTitulo("Cancion de Ejemplo");
        cancionService.saveCancion(cancion);

        Genero genero = new Genero();
        genero.setNombre("Género de Ejemplo");
        generoService.saveGenero(genero);

        Artista artista = new Artista();
        artista.setNombre("Artista de Ejemplo");
        artistaService.saveArtista(artista);

    }
}
