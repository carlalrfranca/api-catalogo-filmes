package br.com.clrf.service;

import br.com.clrf.client.FilmesApi;
import br.com.clrf.model.Filme;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TopFilmes {

    private final FilmesApi filmesApi;

    public List<Filme> buscarTopFilmes() throws Exception {
        return filmesApi.buscarTopFilmes();
    }
}