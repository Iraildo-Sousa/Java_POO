/* Crie uma classe Curso com os atributos nome e duracao (em horas). Utilize métodos getter e setter para manipular esses atributos. No método main, defina os valores de nome e duracao, e depois exiba-os. */

public class Curso {
    
    /* Atributos */

    private String nome;
    private int duracao;

    /* Construtor de Bloco */

    public Curso (String nome, int duracao) {

        this.nome = nome;
        this.duracao = duracao;

    }

        /* Métodos setters */

    private void setNome (String nome) {

        this.nome = nome;

    }

    private void setDuracao (int duracao) {

        this.duracao = duracao;

    }

    /* Métodos getters */

    private String getNome () {

        return nome;

    }

    private int getDuracao () {

        return duracao;

    }        

    public static void main(String[] args) {
        
        Curso senac = new Curso ("Desenvolvimento de Sistemas", 1200);

        senac.setNome("Desenvolvimento de Sistemas");
        senac.setDuracao(1200);

        System.out.println("Nome do curso: " + senac.getNome() + "\nDuração do curso: " + senac.getDuracao());

    }

}

