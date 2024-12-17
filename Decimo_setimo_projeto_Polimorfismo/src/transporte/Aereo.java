package transporte;

public class Aereo extends Transporte {
    
    private double altitudeMaxima;

    /* Bloco de construção */

    public Aereo (String nome, int capacidade, double velocidadeMaxima, double altitudeMaxima) {

        super(nome, capacidade, velocidadeMaxima);
        this.altitudeMaxima = altitudeMaxima;

    }

    /* Get altitudeMaxima */

    public double getAltitudeMaxima() {

        return altitudeMaxima;

    }

    /* Set altitudeMaxima */

    public void setTipoCombustivel(double altitudeMaxima) {

        this.altitudeMaxima = altitudeMaxima;

    }

    public void exibirInformacoes3() {

        System.out.printf("Transporte Aéreo%n%n");
        super.exibirInformacoes();
        System.out.printf("Altitude Máxima: %.0f%n%n", altitudeMaxima);
    }


}