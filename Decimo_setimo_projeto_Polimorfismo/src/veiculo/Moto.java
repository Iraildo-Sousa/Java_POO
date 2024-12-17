package veiculo;

public class Moto extends Veiculo{
    
    private double cilindradas;

    /* Construtor de classe */

    public Moto (String marca, int ano, double cilindradas) {

        super(marca, ano);
        this.cilindradas = cilindradas;

    }

    /* Get */

    public double getCilindradas() {

        return cilindradas;

    }

    /* Set */

    public void setCilindradas(double cilindradas) {

        this.cilindradas = cilindradas;

    } 

    public void detalhes1() {

        System.out.printf("%nDetalhes da Moto%n%n");
        super.detalhes();
        System.out.printf("Cilindradas: %.1fcm³%n", cilindradas);

    }

}
