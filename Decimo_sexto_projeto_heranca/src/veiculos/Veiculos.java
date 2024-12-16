package veiculos;

public class Veiculos {
 
    private String modelo;
    private double capacidade_tanque;
    
    /* BLoco de construção */

    public Veiculos(String modelo, double capacidade_tanque) {

        this.modelo = modelo;
        this.capacidade_tanque = capacidade_tanque;

    }

    public String getModelo() {

        return modelo;

    }

    public void setModelo(String modelo) {

        this.modelo = modelo;

    }

    public double getCapacidade_tanque() {

        return capacidade_tanque;

    }

    public void setCapacidade_tanque(double capacidade_tanque) {


        this.capacidade_tanque = capacidade_tanque;

    }

    public void exibir_informacoes() {

        System.out.printf("Modelo: %s%nCapacidade do tanque: %.1f%n");

    }


}
