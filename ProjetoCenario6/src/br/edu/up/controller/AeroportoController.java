package br.edu.up.controller;

import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Tripulacao;

public class AeroportoController {

    private Passageiro[] passageiros;
    private Tripulacao[] tripulacao;
    private Aeronave[] aeronaves;
    private int numPassageiros;
    private int numTripulacao;
    private int numAeronaves;

    public AeroportoController(int capacidadePassageiros, int capacidadeTripulacao, int capacidadeAeronaves) {
        this.passageiros = new Passageiro[capacidadePassageiros];
        this.tripulacao = new Tripulacao[capacidadeTripulacao];
        this.aeronaves = new Aeronave[capacidadeAeronaves];
        this.numPassageiros = 0;
        this.numTripulacao = 0;
        this.numAeronaves = 0;
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros[numPassageiros++] = passageiro;
    }

    public void adicionarTripulacao(Tripulacao membroTripulacao) {
        tripulacao[numTripulacao++] = membroTripulacao;
    }

    public void adicionarAeronave(Aeronave aeronave) {
        aeronaves[numAeronaves++] = aeronave;
    }

}
