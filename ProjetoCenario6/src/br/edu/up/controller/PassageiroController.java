package br.edu.up.controller;

import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;

public class PassageiroController {

    public Passageiro criarPassageiro(String nome, int rg, String identificadorBagagem, Passagem passagem) {
        return new Passageiro(nome, rg, identificadorBagagem, passagem);
    }
}
