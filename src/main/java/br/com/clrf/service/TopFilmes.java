package br.com.clrf.service;

import br.com.clrf.model.Filme;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ListarTopFilmes {

    private final FilmesApiClient filmesApiClient;

    public List<Filme> buscarTopFilmes() {
        return filmesApiClient.buscarTopFilmes();
    }
}
