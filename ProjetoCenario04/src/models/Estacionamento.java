package models;

import java.util.List;

public class Estacionamento {

    private List<Carro> vagas;
    private int capacidade;
    private int veiculosEntraram;
    private int getVeiculosSairam;
    private double totalReceita;

    public Estacionamento(List<Carro> vagas, int capacidade, int veiculosEntraram, int getVeiculosSairam,
            double totalReceita) {
        this.vagas = vagas;
        this.capacidade = capacidade;
        this.veiculosEntraram = veiculosEntraram;
        this.getVeiculosSairam = getVeiculosSairam;
        this.totalReceita = totalReceita;
    }

    public List<Carro> getVagas() {
        return vagas;
    }

    public void setVagas(List<Carro> vagas) {
        this.vagas = vagas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getVeiculosEntraram() {
        return veiculosEntraram;
    }

    public void setVeiculosEntraram(int veiculosEntraram) {
        this.veiculosEntraram = veiculosEntraram;
    }

    public int getVeiculosSairamgetVeiculosSairam() {
        return getVeiculosSairam;
    }

    public void setVeiculosSairamgetVeiculosSairam(int getVeiculosSairam) {
        this.getVeiculosSairam = getVeiculosSairam;
    }

    public double getTotalReceita() {
        return totalReceita;
    }

    public void setTotalReceita(double totalReceita) {
        this.totalReceita = totalReceita;
    }
}
