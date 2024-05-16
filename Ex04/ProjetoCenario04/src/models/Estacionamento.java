package models;

public class Estacionamento {

    private Carro[] vagas;
    private int entradas;
    private int saidas;
    private int incrementarEntradas;
    private int incrementarSaidas;

    public Estacionamento(int totalDeVagas) {
        this.vagas = new Carro[totalDeVagas];
        this.entradas = 0;
        this.saidas = 0;
    }
    
    
    

    public void getIncrementarEntradas() {
        entradas++;
    }
    public void setIncrementarEntradas(int incrementarEntradas) {
        this.incrementarEntradas = incrementarEntradas;
    }
    public void getIncrementarSaidas() {
        saidas++;
    }
    public void setIncrementarSaidas(int incrementarSaidas) {
        this.incrementarSaidas = incrementarSaidas;
    }
    
   
    public Carro[] getVagas() {
        return vagas;
    }
    public void setVagas(Carro[] vagas) {
        this.vagas = vagas;
    }
    public int getEntradas() {
        return entradas;
    }
    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
    public int getSaidas() {
        return saidas;
    }
    public void setSaidas(int saidas) {
        this.saidas = saidas;
    }

 
    
}
  