package veiculos;

public class Caminhao extends Veiculos {
    
    private double capacidade_carga;
    
    /* Bloco construtor */
    
    public Caminhao (String modelo, double capacidade_tanque, double capacidade_carga) {

        super(modelo, capacidade_tanque);
        this.capacidade_carga = capacidade_carga;

    }

    /* get */

    public double getCapacidade_carga() {

        return capacidade_carga;

    }

    /* set */

    public void setCapacidade_carga(double capacidade_carga) {

        this.capacidade_carga = capacidade_carga;

    }

    public void exibir_informacoes3() {

        System.out.printf("Informações do Caminhão%n%n");
        super.exibir_informacoes();
        System.out.printf("Capacidade de carga: %.0f toneladas%n%n", capacidade_carga);

    }

}
