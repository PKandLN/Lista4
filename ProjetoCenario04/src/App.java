import models.Prompt;
import models.Carro;
import models.Estacionamento;
import controllers.ControleDeEstacionamento;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro(null, null, null);

        String modelo = Prompt.lerLinha("Digite o modelo do seu carro: " );
        carro.setModelo(modelo);
        

        String placa = Prompt.lerLinha("Digite a placa do seu carro: " );
        carro.setPlaca(placa);

        String cor = Prompt.lerLinha("Digite a cor do seu carro: " );
        carro.setCor(cor);

        
        //System.out.println("Modelo: " + carro.getModelo());
        //System.out.println("Placa: " + carro.getPlaca());
        //System.out.println("Cor: " + carro.getCor());
        

        
    }
}
