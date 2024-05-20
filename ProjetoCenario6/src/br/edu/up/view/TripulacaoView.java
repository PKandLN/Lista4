package br.edu.up.view;

import br.edu.up.models.Comandante;
import br.edu.up.models.Comissario;
import br.edu.up.models.Prompt;
import br.edu.up.models.Tripulacao;

public class TripulacaoView {

    public Comandante solicitarDadosComandante() {
        String nome = Prompt.lerLinha("Digite o nome do comandante:");
        int rg = Prompt.lerInteiro("Digite o RG do comandante:");
        String identificacaoAeronautica = Prompt.lerLinha("Digite a identificação aeronáutica:");
        String matriculaFuncionario = Prompt.lerLinha("Digite a matrícula do funcionário:");
        int totalHorasVoo = Prompt.lerInteiro("Digite o total de horas de voo do comandante:");
        return new Comandante(nome, rg, identificacaoAeronautica, matriculaFuncionario, totalHorasVoo);
    }

    public Comissario solicitarDadosComissario() {
        String nome = Prompt.lerLinha("Digite o nome do comissário:");
        int rg = Prompt.lerInteiro("Digite o RG do comissário:");
        String identificacaoAeronautica = Prompt.lerLinha("Digite a identificação aeronáutica:");
        String matriculaFuncionario = Prompt.lerLinha("Digite a matrícula do funcionário:");
        String idiomas = Prompt.lerLinha("Digite os idiomas em que o comissário possui fluência (separados por vírgula):");
        String[] idiomasArray = idiomas.split(",");
        return new Comissario(nome, rg, identificacaoAeronautica, matriculaFuncionario, idiomasArray);
    }

    

}
