package br.com.clrf.client;

import br.com.clrf.mapper.FilmesJsonMapper;
import br.com.clrf.model.Filme;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FilmesApi {

    private final FilmesHttpClient httpClient;
    private final FilmesJsonMapper mapper;

    public List<Filme> buscarTopFilmes() throws Exception {
        String jsonResponse = httpClient.obterJsonFilmes();
        return mapper.topFilmes(jsonResponse);
    }
}
