package pagamento;

public class Pix extends Pagamento {

    private double transferencia;

    /* Bloco de construção */

    public Pix (double valor, double transferencia) {

        super(valor);
        this.transferencia = transferencia;

    }

    /* Get transferencia */

    public double getTranferencia() {

        return transferencia;

    } 

    /* Set transferencia */

    public void setTransferencia(double transferencia) {

        this.transferencia = transferencia;

    }

    public void realizar_pagamento3() {

        System.out.printf("Pagamento Pix%n%n");
        super.realizar_pagamento();
        System.out.printf("Pix: R$ %.2f%n%n", transferencia);

    }

    
}
