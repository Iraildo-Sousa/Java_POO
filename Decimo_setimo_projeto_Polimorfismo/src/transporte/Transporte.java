package transporte;

public class Transporte {
    
    private String nome;
    private int capacidade;
    private double velocidadeMaxima;

    /* Construtor de classe */
    
    public Transporte (String nome, int capacidade, double velocidadeMaxima) {

        this.nome = nome;
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    /* Get nome */

    public String getNome() {

        return nome;

    }

    /* Set nome */

    public void setNome(String nome) {

        this.nome = nome;

    }

    /* Get capacidade */

    public int getCapacidade() {

        return capacidade;

    } 

    /* Set capacidade */

    public void setCapacidade(int capacidade) {

        this.capacidade = capacidade;

    }

    /* Get velocidadeMaxima */

    public double getVelocidadeMaxima() {

        return velocidadeMaxima;
        
    }

    /* Set velocidadeMaxima */

    public void setVelocidadeMaxima(double velocidadeMaxima) {

        this.velocidadeMaxima = velocidadeMaxima;

    }

    /* Método Exibir informação */

    public void exibirInformacoes() {

        System.out.printf("Nome: %s%nCapacidade de pessoas: %d passageiros%nVelocidade Máxima: %.0fkm%n", nome, capacidade, velocidadeMaxima);

    }

}
