package pagamento;

public class Pagamento {
    
    private double valor;
    
    /* Bloco de construção */

    public Pagamento (double valor) {

        this.valor = valor;

    }

    /* Get valor */

    public double getValor() {

        return valor;

    }

    /* Set valor */

    public void setValor(double valor) {

        this.valor = valor;
        
    }

    /* Método realizar_pagamento */

    public void realizar_pagamento() {

        System.out.printf("Valor: R$ %.2f%n", valor);

    }

}
