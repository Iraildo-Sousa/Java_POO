package banco;

public class Conta_Corrente extends Conta_Bancaria {

    private double limite;

    /* Construtor de classe */

    public Conta_Corrente(String numero_conta, double saldo, double limite) {

        super(numero_conta, saldo);
        this.limite = limite;

    }

    /* Get limite */

    public double getLimite(){

        return limite;

    }

    /* Set limite */

    public void setLimite(double limite) {

        this.limite = limite;

    }

    public void exibirDetalhes() {

        System.out.printf("Conta Poupança%n%n");
        super.exibirDetalhes();
        System.out.printf("%nLimite: %.2f%n%n", limite);

    }

}