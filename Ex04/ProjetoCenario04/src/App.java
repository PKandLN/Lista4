import models.Prompt;
import models.Carro;
import models.Estacionamento;
import controllers.EstacionamentoController;
import views.EstacionamentoView;

public class App {
    public static void main(String[] args) throws Exception {
        Estacionamento estacionamento = new Estacionamento(10);
        EstacionamentoView view = new EstacionamentoView();
        EstacionamentoController controller = new EstacionamentoController(estacionamento);

        while (true) {
            int opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    Carro carro = view.obterDetalhesCarro();
                    if (controller.adicionarCarro(carro)) {
                        view.mostrarMensagem("Carro adicionado com sucesso.");
                    } else {
                        view.mostrarMensagem("Estacionamento cheio.");
                    }
                    break;
                case 2:
                    String placa = view.obterPlaca();
                    if (controller.removerCarro(placa)) {
                        view.mostrarMensagem("Carro removido com sucesso.");
                    } else {
                        view.mostrarMensagem("Carro não encontrado.");
                    }
                    break;
                case 3:
                    String relatorio = controller.emitirRelatorio(5);
                    view.mostrarRelatorio(relatorio);
                    break;
                case 4:
                    view.mostrarMensagem("Saindo do sistema.");
                    System.exit(0);
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        }
    }
       
    }

        
    
        

        

