package controllers;
import models.Carro;
import models.Estacionamento;

public class EstacionamentoController {
    
    private Estacionamento estacionamento;

    public EstacionamentoController(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public boolean adicionarCarro(Carro carro) {
        Carro[] vagas = estacionamento.getVagas();
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] == null) {
                vagas[i] = carro;
                estacionamento.getIncrementarEntradas();
                return true;
            }
        }
        return false; // Estacionamento cheio
    }

    public boolean removerCarro(String placa) {
        Carro[] vagas = estacionamento.getVagas();
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && vagas[i].getPlaca().equals(placa)) {
                vagas[i] = null;
                estacionamento.getIncrementarSaidas();
                return true;
            }
        }
        return false; // Carro não encontrado
    }

    public String emitirRelatorio(int valorPeriodo) {
        int entradas = estacionamento.getEntradas();
        int saidas = estacionamento.getSaidas();
        double total = calcularTotal(valorPeriodo);
        return "Entradas: " + entradas + "\n" +
               "Saídas: " + saidas + "\n" +
               "Total arrecadado: R$ " + total;
    }

    private double calcularTotal(int valorPeriodo) {
        return valorPeriodo * (estacionamento.getEntradas() - estacionamento.getSaidas());
    }
}

