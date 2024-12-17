package veiculos;

public class Carro extends Veiculos {
    
    private double consumo_km;
    
    /* Bloco construtor */
    
    public Carro (String modelo, double capacidade_tanque, double consumo_km) {

        super(modelo, capacidade_tanque);
        this.consumo_km = consumo_km;

    }

    /* get */

    public double getConsumo_km() {

        return consumo_km;

    }

    /* set */

    public void setConsumo(double consumo_km) {

        this.consumo_km = consumo_km;

    }

    public void exibir_informacoes1() {

        System.out.printf("Informações do Carro%n%n");
        super.exibir_informacoes();
        System.out.printf("Consumo por km: %.0f%n%n", consumo_km);

    }

}
