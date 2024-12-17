package banco;

public class Conta_Poupanca extends Conta_Bancaria {

    private double taxaDeJuros;

    /* Construtor de classe */

    public Conta_Poupanca(String numero_conta, double saldo, double taxaDeJuros) {

        super(numero_conta, saldo);
        this.taxaDeJuros = taxaDeJuros;

    }

    /* Get limite */

    public double getTaxaDeJuros(){

        return taxaDeJuros;

    }

    /* Set limite */

    public void setTaxaDeJuros(double taxaDeJuros) {

        this.taxaDeJuros = taxaDeJuros;

    }

    public void exibirDetalhes() {

        System.out.printf("Conta Poupança%n%n");
        super.exibirDetalhes();
        System.out.printf("%nTaxa de juros: %.2f", taxaDeJuros);

    }

}