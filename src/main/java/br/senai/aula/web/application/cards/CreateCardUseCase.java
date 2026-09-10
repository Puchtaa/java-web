package br.senai.aula.web.application.cards;

import br.senai.aula.web.domain.cards.Card;
import br.senai.aula.web.domain.cards.Naipe;
import br.senai.aula.web.domain.cards.Valor;

public interface CreateCardUseCase {

    Card create(Valor valor, Naipe naipe);
}
