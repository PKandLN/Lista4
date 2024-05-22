import br.edu.up.controllers.ContatoController;
import br.edu.up.models.Comercial;
import br.edu.up.models.Contato;
import br.edu.up.models.Pessoal;
import br.edu.up.view.ContatoView;

public class Programa {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();

        boolean executando = true;

        while (executando) {
            int opcao = view.exibirMenu();

            switch (opcao) {
                case 1:
                    int codigoPessoal = controller.gerarCodigo();
                    Pessoal pessoal = view.lerContatoPessoal(codigoPessoal);
                    controller.adicionarContato(pessoal);
                    view.exibirMensagem("Contato pessoal adicionado com sucesso.");
                    break;
                case 2:
                    int codigoComercial = controller.gerarCodigo();
                    Comercial comercial = view.lerContatoComercial(codigoComercial);
                    controller.adicionarContato(comercial);
                    view.exibirMensagem("Contato comercial adicionado com sucesso.");
                    break;
                case 3:
                    int codigoExcluir = view.lerCodigo();
                    if (controller.excluirContato(codigoExcluir)) {
                        view.exibirMensagem("Contato excluído com sucesso.");
                    } else {
                        view.exibirMensagem("Contato não encontrado.");
                    }
                    break;
                case 4:
                    int codigoConsultar = view.lerCodigo();
                    Contato contato = controller.consultarContato(codigoConsultar);
                    view.exibirContato(contato);
                    break;
                case 5:
                    view.exibirContatos(controller.listarContatos());
                    break;
                case 6:
                    executando = false;
                    view.exibirMensagem("Saindo do programa.");
                    break;
                default:
                    view.exibirMensagem("Opção inválida.");
                    break;
            }
        }
    }
}
