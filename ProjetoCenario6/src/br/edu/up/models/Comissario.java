package br.edu.up.models;

public class Comissario extends Tripulacao{

    private String[] idiomas;

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public Comissario(String nome, int rg, String identificacaoAeronautica, String matriculaFuncionario, String[] idiomas) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.idiomas = idiomas;
    }

}
