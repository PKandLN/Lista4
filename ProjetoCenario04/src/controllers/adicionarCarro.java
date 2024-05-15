package controllers;
import models.Estacionamento;

public class adicionarCarro {

    public boolean adicionarCarro(Carro carro) {
        if (vagas.size() < capacidade) {
            vagas.add(carro);
            veiculosEntraram++;
            return true;
        } else {
            return false;
        }
    }

}
