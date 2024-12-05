/* Exercícios 17 OOP - Crie uma classe chamada Produto com atributos para nome e quantidade em estoque, garantindo que a quantidade em estoque não seja negativa. */

public class Produto {
    
    private String nome;
    private int quantidade;

    private Produto (String nome, int quantidade) {

        this.nome = nome;
        this.quantidade = quantidade;

    }

    public void exibirInformacoes() {

        System.out.println("Nome: " + this.nome);

        if (quantidade > 0) {

            System.out.println("A quantidade de produto é " + this.quantidade);

        }

        else {

            System.out.println("Sem estoque.");

        }

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getQuantidade() {

        return quantidade;

    }

    public void setQuantidade(int quantidade) {

        this.quantidade =  quantidade;

    }

    public static void main (String [] args) {

        Produto produto = new Produto ("Samsung Gran Prime", 1);

        produto.exibirInformacoes();

    }

}
