public class Produto {
    
    String nome;
    double preco;
    int quantidade;

    public Produto (String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome() {
     
        return nome;
    }

    public double getPreco() {

        return preco;

    }

    public int getQuantidade() {

        return quantidade;
    }


    public static void main(String[] args) {
    
        Produto Produto = new Produto("celulares", 1000.05, 5);
        System.out.println("Em nossa loja temos " + Produto.getQuantidade() + " " + Produto.getNome() + " que custam R$ " + Produto.getPreco() + ".");
        
        
    }

}
