package br.com.clrf.controller;

import br.com.clrf.dto.FilmesResposta;
import br.com.clrf.service.TopFilmes;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmes")
@RequiredArgsConstructor
public class FilmesController {

    private final TopFilmes topFilmes;

    @GetMapping("/top")
    public FilmesResposta listarTopFilmes() throws Exception {
        return new FilmesResposta(topFilmes.buscarTopFilmes());
    }
}