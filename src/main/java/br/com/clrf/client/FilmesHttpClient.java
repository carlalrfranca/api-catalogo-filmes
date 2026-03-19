package br.com.clrf.client;

import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.http.*;
import static java.net.URI.create;

@Component
public class FilmesHttpClient {

    private static final String URL =
            "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";

    private final HttpClient client = HttpClient.newHttpClient();

    public String obterJsonFilmes() throws IOException, InterruptedException {

        var requisicao = HttpRequest.newBuilder()
                .uri(create(URL))
                .GET()
                .build();

        var response = client.send(requisicao, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
