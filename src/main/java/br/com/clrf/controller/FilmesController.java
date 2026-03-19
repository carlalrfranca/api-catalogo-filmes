package br.com.clrf.controller;

import br.com.clrf.model.Filme;
import br.com.clrf.service.BuscarFilmesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/filmes")
@RequiredArgsConstructor
public class FilmesController {

    private final BuscarFilmesService service;

     @GetMapping("/top")
     public List<Filme> listarTopFilmes() {
         return service.buscarTopFilmes();
     }
}

