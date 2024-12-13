package veiculo;

public class Carro extends Veiculo{
    
    private int nPortas;

    /* Construtor de classe */

    public Carro (String marca, int ano, int nPortas) {

        super(marca, ano);
        this.nPortas = nPortas;

    }

    /* Get */

    public int getNportas() {

        return nPortas;

    }

    /* Set */

    public void setNportas(int nPortas) {

        this.nPortas = nPortas;

    } 

    public void detalhes1() {

        System.out.printf("%nDetalhes do Carro%n%n");
        super.detalhes();
        System.out.printf("Número de Portas: %d", nPortas);

    }

}