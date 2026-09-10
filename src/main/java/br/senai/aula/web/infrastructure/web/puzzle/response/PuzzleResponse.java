package br.senai.aula.web.infrastructure.web.puzzle.response;

import br.senai.aula.web.domain.puzzle.Puzzle;

public record PuzzleResponse(Long id, String[] alternativas, Integer alternativaCorreta) {

    public static PuzzleResponse from(Puzzle puzzle) {
        return new PuzzleResponse(puzzle.id(), puzzle.alternativas(), puzzle.alternativaCorreta());
    }
}
