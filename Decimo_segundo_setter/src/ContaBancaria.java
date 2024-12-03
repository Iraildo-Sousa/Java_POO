public class ContaBancaria {
    
    private int numero_conta;
    private double saldo_conta;
    private int digito_conta;
    
    /* Construtor de Bloco */

    public ContaBancaria (int numero_conta, int digito_conta, double saldo_conta) {

        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.saldo_conta = saldo_conta;

    }

    /* Métodos setters */

    private void setNumero(int numero_conta) {

        this.numero_conta = numero_conta;

    }

    private void setDigito(int digito_conta) {

        this.digito_conta = digito_conta;

    }
    
    private void setSaldo(double saldo_conta) {

        this.saldo_conta = saldo_conta;

    }

    /* Métodos getters */
    
    private int getNumero () {

        return numero_conta;

    }

    private int getDigito () {

        return digito_conta;

    }

    private double getSaldo () {

        return saldo_conta;

    }

    /* Método principal */

    public static void main (String [] args) {

        ContaBancaria caixa_eletronico = new ContaBancaria (00001, 2, 500);

        caixa_eletronico.setNumero (10001);
        caixa_eletronico.setDigito (2);
        caixa_eletronico.setSaldo (500);

        System.out.println("Numero da conta: " + caixa_eletronico.getNumero() + "-" + caixa_eletronico.getDigito() + "\nSaldo da conta: R$ " + caixa_eletronico.getSaldo());
        

    } 

}
