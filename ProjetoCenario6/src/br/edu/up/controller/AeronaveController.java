package br.edu.up.controller;

import br.edu.up.models.Aeronave;

public class AeronaveController {

    public Aeronave criarAeronave(String codigo, String tipo, int quantidadeAssentos) {
        return new Aeronave(codigo, tipo, quantidadeAssentos);
    }

}
