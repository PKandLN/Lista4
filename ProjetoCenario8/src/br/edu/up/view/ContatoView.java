package br.edu.up.view;

import java.util.List;
import br.edu.up.models.Comercial;
import br.edu.up.models.Contato;
import br.edu.up.models.Pessoal;
import br.edu.up.models.Prompt;

public class ContatoView {

    public int exibirMenu() {
        Prompt.imprimir("Agenda de Contatos");
        Prompt.imprimir("1. Incluir um contato pessoal");
        Prompt.imprimir("2. Incluir um contato comercial");
        Prompt.imprimir("3. Excluir um contato pelo código");
        Prompt.imprimir("4. Consultar um contato pelo código");
        Prompt.imprimir("5. Listar todos os contatos");
        Prompt.imprimir("6. Sair do programa");
        return Prompt.lerInteiro("Escolha uma opção: ");
    }

    public Pessoal lerContatoPessoal(int codigo) {
        String nome = Prompt.lerLinha("Nome: ");
        String telefone = Prompt.lerLinha("Telefone: ");
        String dataNascimento = Prompt.lerLinha("Data de Nascimento: ");
        return new Pessoal(codigo, nome, telefone, dataNascimento);
    }

    public Comercial lerContatoComercial(int codigo) {
        String nome = Prompt.lerLinha("Nome: ");
        String telefone = Prompt.lerLinha("Telefone: ");
        String empresa = Prompt.lerLinha("Empresa: ");
        return new Comercial(codigo, nome, telefone, empresa);
    }

    public int lerCodigo() {
        return Prompt.lerInteiro("Código: ");
    }

    public void exibirContato(Contato contato) {
        if (contato == null) {
            Prompt.imprimir("Contato não encontrado.");
        } else {
            Prompt.imprimir(contato);
        }
    }

    public void exibirContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            Prompt.imprimir("Nenhum contato encontrado.");
        } else {
            contatos.forEach(Prompt::imprimir);
        }
    }

    public void exibirMensagem(String mensagem) {
        Prompt.imprimir(mensagem);
    }
}
