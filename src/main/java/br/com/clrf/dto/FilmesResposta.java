package br.com.clrf.dto;

import br.com.clrf.model.Filme;
import java.util.List;

public record FilmesResposta(List<Filme> data) {}