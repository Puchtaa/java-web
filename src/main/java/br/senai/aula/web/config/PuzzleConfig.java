package br.senai.aula.web.config;

import br.senai.aula.web.application.puzzle.port.in.CreatePuzzleUseCase;
import br.senai.aula.web.application.puzzle.port.in.GetPuzzleUseCase;
import br.senai.aula.web.application.puzzle.port.out.PuzzleRepositoryPort;
import br.senai.aula.web.application.puzzle.service.CreatePuzzleService;
import br.senai.aula.web.application.puzzle.service.GetPuzzleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PuzzleConfig {

    @Bean
    CreatePuzzleUseCase createPuzzleUseCase(PuzzleRepositoryPort puzzleRepository) {
        return new CreatePuzzleService(puzzleRepository);
    }

    @Bean
    GetPuzzleUseCase getPuzzleUseCase(PuzzleRepositoryPort puzzleRepository) {
        return new GetPuzzleService(puzzleRepository);
    }
}
