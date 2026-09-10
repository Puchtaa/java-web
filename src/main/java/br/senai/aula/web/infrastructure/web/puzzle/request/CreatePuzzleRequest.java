package br.senai.aula.web.infrastructure.web.puzzle.request;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotNull;

public record CreatePuzzleRequest(
        @Positive(message = "Adicione algumas charadas") String[] alternativas,
        @NotNull(message = "Adicione a resposta correta") Integer alternativaCorreta
) {
}

