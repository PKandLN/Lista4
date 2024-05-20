package br.edu.up.controller;

import br.edu.up.models.Comandante;
import br.edu.up.models.Comissario;

public class TripulacaoController {

    public Comandante criarComandante(String nome, int rg, String identificacaoAeronautica, String matriculaFuncionario, int totalHorasVoo) {
        return new Comandante(nome, rg, identificacaoAeronautica, matriculaFuncionario, totalHorasVoo);
    }

    public Comissario criarComissario(String nome, int rg, String identificacaoAeronautica, String matriculaFuncionario, String[] idiomas) {
        return new Comissario(nome, rg, identificacaoAeronautica, matriculaFuncionario, idiomas);
    }
}
