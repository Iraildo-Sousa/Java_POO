package transporte;

public class Maritimo extends Transporte {
    
    private String tipoCasco;

    /* Bloco de construção */

    public Maritimo (String nome, int capacidade, double velocidadeMaxima, String tipoCasco) {

        super(nome, capacidade, velocidadeMaxima);
        this.tipoCasco = tipoCasco;

    }

    /* Get tipoCasco */

    public String getTipoCasco() {

        return tipoCasco;

    }

    /* Set tipoCasco */

    public void setTipoCasco(String tipoCasco) {

        this.tipoCasco = tipoCasco;

    }

    public void exibirInformacoes2() {

        System.out.printf("Transporte Marítimo%n%n");
        super.exibirInformacoes();
        System.out.printf("Tipo de casco: %s%n%n", tipoCasco);
    }


}
