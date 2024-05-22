package br.edu.up.models;

public class Pessoal extends Contato {
   
    private String dataNascimento;

    public Pessoal(int codigo, String nome, String telefone, String dataNascimento) {
        super(codigo, nome, telefone);
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String getTipo() {
        return "Pessoal";
    }
}
