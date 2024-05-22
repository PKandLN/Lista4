package br.edu.up.controllers;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.models.Contato;

public class ContatoController {
    private List<Contato> contatos;
    private int proximoCodigo;

    public ContatoController() {
        contatos = new ArrayList<>();
        proximoCodigo = 1;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public boolean excluirContato(int codigo) {
        return contatos.removeIf(contato -> contato.getCodigo() == codigo);
    }

    public Contato consultarContato(int codigo) {
        return contatos.stream()
                .filter(contato -> contato.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public List<Contato> listarContatos() {
        return new ArrayList<>(contatos);
    }

    public int gerarCodigo() {
        return proximoCodigo++;
    }
}