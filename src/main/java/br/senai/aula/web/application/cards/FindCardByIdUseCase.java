package br.senai.aula.web.application.cards;

import br.senai.aula.web.domain.cards.Card;

public interface FindCardByIdUseCase {

    Card findById(Long id);
}
