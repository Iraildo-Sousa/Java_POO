public class Pessoa {
    
    /* Atributos privados da classe pessoa */
    private String nome;
    private int idade;

    /* Construtor de Bloco da Classe Pessoa */

    public Pessoa (String nome, int idade) {

        this.idade = idade;
        this.nome = nome;

    }

    /* Método setter para mudar */

    public void setNome (String nome){

        this.nome = nome;

    }

    public void setIdade (int idade){

        this.idade = idade;

    }

    /* Método getter */

    public String getNome(){

        return nome;

    }

    public int getIdade(){

        return idade;

    }

    /* Método principal */

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Iraildo", 25);
        pessoa.setNome("Iraildo");
        pessoa.setIdade(25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

    }
}
