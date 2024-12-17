package veiculos;

public class Moto extends Veiculos {
    
    private String tipo_motor;
    
    /* Bloco construtor */
    
    public Moto (String modelo, double capacidade_tanque, String tipo_motor) {

        super(modelo, capacidade_tanque);
        this.tipo_motor = tipo_motor;

    }

    /* get */

    public String getTipo_motor() {

        return tipo_motor;

    }

    /* set */

    public void setTipo_motor(String tipo_motor) {

        this.tipo_motor = tipo_motor;

    }

    public void exibir_informacoes2() {

        System.out.printf("Informações da Moto%n%n");
        super.exibir_informacoes();
        System.out.printf("Tipo de motor: %s%n%n", tipo_motor);

    }

}
