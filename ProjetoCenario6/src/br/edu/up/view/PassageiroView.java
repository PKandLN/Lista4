package br.edu.up.view;

import br.edu.up.models.Data;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;
import br.edu.up.models.Prompt;

public class PassageiroView {

    public Passageiro solicitarDadosPassageiro() {
        String nome = Prompt.lerLinha("Digite o nome do passageiro:");
        int rg = Prompt.lerInteiro("Digite o RG do passageiro:");
        String identificadorBagagem = Prompt.lerLinha("Digite o identificador da bagagem:");
        Passagem passagem = solicitarDadosPassagem();
        return new Passageiro(nome, rg, identificadorBagagem, passagem);
    }

    public Passagem solicitarDadosPassagem() {
        int numeroAssento = Prompt.lerInteiro("Digite o número do assento:");
        String classeAssento = Prompt.lerLinha("Digite a classe do assento:");
        Prompt.imprimir("Digite a data do voo (dia mês ano hora minuto):");
        int dia = Prompt.lerInteiro();
        int mes = Prompt.lerInteiro();
        int ano = Prompt.lerInteiro();
        int hora = Prompt.lerInteiro();
        int minuto = Prompt.lerInteiro();
        return new Passagem(numeroAssento, classeAssento, new Data(dia, mes, ano, hora, minuto));
    }

}
