package br.senai.aula.web.application.cards;

import br.senai.aula.web.domain.cards.Card;

import java.util.List;

public interface ListCardsUseCase {

    List<Card> listAll();
}
