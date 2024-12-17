import veiculos.*;

public class Apresentar_veiculos {

    public static void main (String [] args) {

        Carro carro = new Carro("Fiat Uno", 100, 10);
        Moto moto = new Moto("Cg 160 titan", 3, "Tanque a gasolina");
        Caminhao caminhao = new Caminhao("Mercedes accelo", 150, 14);

        carro.exibir_informacoes1();
        moto.exibir_informacoes2();
        caminhao.exibir_informacoes3();

    }
    
}
