package transporte;

public class Terrestre extends Transporte {
    
    private String tipoCombustivel;

    /* Bloco de construção */

    public Terrestre (String nome, int capacidade, double velocidadeMaxima, String tipoCombustivel) {

        super(nome ,capacidade, velocidadeMaxima);
        this.tipoCombustivel = tipoCombustivel;

    }

    /* Get tipoCombustivel */

    public String getTipoCombustivel() {

        return tipoCombustivel;

    }

    /* Set tipoCombustivel */

    public void setTipoCombustivel(String tipoCombustivel) {

        this.tipoCombustivel = tipoCombustivel;

    }

    public void exibirInformacoes1() {

        System.out.printf("Transporte Terrestre%n%n");
        super.exibirInformacoes();
        System.out.printf("Tipo de combustível: %s%n%n", tipoCombustivel);
    }


}
