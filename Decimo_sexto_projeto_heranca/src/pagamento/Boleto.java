package pagamento;

public class Boleto extends Pagamento {

    private double desconto;

    /* Bloco de construção */

    public Boleto (double valor, double desconto) {

        super(valor);
        this.desconto = desconto;

    }

    /* Get desconto */

    public double getDesconto() {

        return desconto;

    } 

    /* Set desconto */

    public void setDesconto(double desconto) {

        this.desconto = desconto;

    }

    public void realizar_pagamento2() {

        System.out.printf("Pagamento Boleto%n%n");
        super.realizar_pagamento();
        System.out.printf("Desconto: R$ %.2f%n%n", desconto);

    }

    
}
