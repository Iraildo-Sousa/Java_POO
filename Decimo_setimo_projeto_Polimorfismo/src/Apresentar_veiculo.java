import veiculo.Carro;
import veiculo.Moto;

public class Apresentar_veiculo {

    public static void main(String[] args) {
        
        Moto moto = new Moto("Honda CG 160", 2015, 162.7);
        Carro carro = new Carro("Mercedes-Benz C200", 2014, 4);

        moto.detalhes1();
        carro.detalhes1();

    }
    
}
