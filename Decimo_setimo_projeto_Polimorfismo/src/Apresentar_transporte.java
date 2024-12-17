import transporte.Terrestre;
import transporte.Aereo;
import transporte.Maritimo;

public class Apresentar_transporte {
    
    public static void main(String[] args) {
        
        Terrestre terrestre = new Terrestre("Carro", 5, 200, "gasolina");
        Aereo aereo = new Aereo("Avião", 305, 9700, 10700);
        Maritimo maritimo = new Maritimo("Titanic", 2435, 42, "casco planador");

        terrestre.exibirInformacoes1();
        aereo.exibirInformacoes3();
        maritimo.exibirInformacoes2();

    }

}
