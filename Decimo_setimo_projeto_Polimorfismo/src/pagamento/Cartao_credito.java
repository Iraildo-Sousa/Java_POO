package pagamento;

public class Cartao_credito extends Pagamento {

    private double taxa;

    /* Bloco de construção */

    public Cartao_credito (double valor, double taxa) {

        super(valor);
        this.taxa = taxa;

    }

    /* Get taxa */

    public double getTaxa() {

        return taxa;

    } 

    /* Set taxa */

    public void setTaxa(double taxa) {

        this.taxa = taxa;

    }

    public void realizar_pagamento1() {

        System.out.printf("Pagamento Crédito%n%n");
        super.realizar_pagamento();
        System.out.printf("Taxa: %.2f%n%n", taxa);

    }

    
}
