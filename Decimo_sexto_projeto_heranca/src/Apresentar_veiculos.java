import veiculos.*;

public class Apresentar_veiculos {

    public static void main (String [] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();

        carro.exibir_detalhes1();
        moto.exibir_detalhes2();
        caminhao.exibir_detalhes3();

    }
    
}
