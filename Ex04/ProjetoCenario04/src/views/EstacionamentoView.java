package views;

import models.Prompt;
import models.Carro;
public class EstacionamentoView {

    public int mostrarMenu() {
        Prompt.imprimir("Menu:");
        Prompt.imprimir("1. Entrada de Veículo");
        Prompt.imprimir("2. Saída de Veículo");
        Prompt.imprimir("3. Emitir Relatório");
        Prompt.imprimir("4. Sair");
        return Prompt.lerInteiro("Escolha uma opção: ");
    }

    public Carro obterDetalhesCarro() {
        String modelo = Prompt.lerLinha("Modelo: ");
        String placa = Prompt.lerLinha("Placa: ");
        String cor = Prompt.lerLinha("Cor: ");
        return new Carro(modelo, placa, cor);
    }

    public String obterPlaca() {
        return Prompt.lerLinha("Placa do carro a ser removido: ");
    }

    public void mostrarMensagem(String mensagem) {
        Prompt.imprimir(mensagem);
    }

    public void mostrarRelatorio(String relatorio) {
        Prompt.imprimir("Relatório:");
        Prompt.imprimir(relatorio);
    }
}



