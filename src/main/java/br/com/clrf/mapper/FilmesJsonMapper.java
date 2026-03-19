package br.com.clrf.mapper;

import br.com.clrf.model.Filme;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.StreamSupport;

@Component
public class FilmesJsonMapper {

    private final ObjectMapper mapper = new ObjectMapper();

    public List<Filme> topFilmes(String json) throws Exception {

        JsonNode root = mapper.readTree(json);
        JsonNode items = root.get("items");

        return StreamSupport.stream(items.spliterator(), false)
                .map(item -> new Filme(
                        item.get("title").asText(),
                        item.get("image").asText(),
                        item.get("imDbRating").asDouble()
                ))
                .toList();
    }
}