package br.edu.up.models;

public class Comercial extends Contato {
    
    private String empresa;

    public Comercial(int codigo, String nome, String telefone, String empresa) {
        super(codigo, nome, telefone);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String getTipo() {
        return "Comercial";
    }
}