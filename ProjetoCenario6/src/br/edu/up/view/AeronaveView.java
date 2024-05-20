package br.edu.up.view;

import br.edu.up.models.Aeronave;
import br.edu.up.models.Data;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;
import br.edu.up.models.Prompt;
import br.edu.up.models.Tripulacao;

public class AeronaveView {

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

    public Tripulacao solicitarDadosTripulacao() {
        String nome = Prompt.lerLinha("Digite o nome do membro da tripulação:");
        String rg = Prompt.lerLinha("Digite o RG do membro da tripulação:");
        String identificacaoAeronautica = Prompt.lerLinha("Digite a identificação aeronáutica:");
        String matriculaFuncionario = Prompt.lerLinha("Digite a matrícula do funcionário:");
        // Implemente a leitura para Comandante e Comissario
        return null;
    }

    public Aeronave solicitarDadosAeronave() {
        String codigo = Prompt.lerLinha("Digite o código da aeronave:");
        String tipo = Prompt.lerLinha("Digite o tipo da aeronave:");
        int quantidadeAssentos = Prompt.lerInteiro("Digite a quantidade de assentos da aeronave:");
        return new Aeronave(codigo, tipo, quantidadeAssentos);
    }

}
