package pessoas;

public class Pessoa {
    
    /* Atrinutos */

    public String nome;
    public int idade;

    /* Construtor de classe */

    public Pessoa (String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    /* Get */

    public String getNome() {

        return nome;

    }

    /* Set */

    public void setNome(String nome) {

        this.nome = nome;

    }

    /* Get */

    public int getIdade(){

        return idade;

    }

    /* Set */

    public void setIdade(int idade) {

        this.idade = idade;

    }

    public void apresentar() {

        System.out.printf("Nome: %s.\nIdade: %d", nome, idade); 

    }

}
