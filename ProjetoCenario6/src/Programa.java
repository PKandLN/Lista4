import br.edu.up.controller.AeroportoController;
import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Prompt;
import br.edu.up.models.Tripulacao;
import br.edu.up.view.AeronaveView;
import br.edu.up.view.PassageiroView;
import br.edu.up.view.TripulacaoView;

public class Programa {
    public static void main(String[] args) throws Exception {
        AeroportoController aeroportoController = new AeroportoController(100, 100, 100);
        PassageiroView passageiroView = new PassageiroView();
        TripulacaoView tripulacaoView = new TripulacaoView();
        AeronaveView aeronaveView = new AeronaveView();

        int opcao;
        do {
            Prompt.separador();
            Prompt.imprimir("Menu:");
            Prompt.imprimir("1. Adicionar passageiro");
            Prompt.imprimir("2. Adicionar tripulação");
            Prompt.imprimir("3. Adicionar aeronave");
            Prompt.imprimir("4. Sair");
            Prompt.separador();

            opcao = Prompt.lerInteiro("Escolha uma opção:");

            switch (opcao) {
                case 1:
                    Passageiro passageiro = passageiroView.solicitarDadosPassageiro();
                    aeroportoController.adicionarPassageiro(passageiro);
                    Prompt.imprimir("Passageiro adicionado com sucesso!");
                    break;
                case 2:
                    Tripulacao tripulacao = tripulacaoView.solicitarDadosTripulacao();
                    aeroportoController.adicionarTripulacao(tripulacao);
                    Prompt.imprimir("Tripulação adicionada com sucesso!");
                    break;
                case 3:
                    Aeronave aeronave = aeronaveView.solicitarDadosAeronave();
                    aeroportoController.adicionarAeronave(aeronave);
                    Prompt.imprimir("Aeronave adicionada com sucesso!");
                    break;
                case 4:
                    Prompt.imprimir("Encerrando o programa...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);
    }
    }

