package br.senai.aula.web.infrastructure.web.user.card;

import br.senai.aula.web.application.cards.CreateCardUseCase;
import br.senai.aula.web.domain.cards.Card;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cards")
public class CardController {

    private final CreateCardUseCase createCardUseCase;

    public CardController(CreateCardUseCase createCardUseCase) {
        this.createCardUseCase = createCardUseCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CardResponse create(@Valid @RequestBody CreateCardRequest request) {

        Card card = createCardUseCase.create(
                request.valor(),
                request.naipe()
        );

        return CardResponse.from(card);
    }
}