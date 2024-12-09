/* Exercícios 20 OOP - Criar uma classe "Cachorro" com atributos para nome e métodos comeu, bebeu, latiu e lambeu. Não esqueça do Encapsulamento e  exibir as informações.

Exemplos de exibição:
- O cachorro comeu
- O cachorro bebeu
- O cachorro latiu
- O cachorro Lambeu */

public class Cachorro {

    /* Atributos */

    private String nome;

    /* Bloco de construção */

    public Cachorro (String nome) {

      this.nome = nome;

    }

    public String getNome() {

        return nome;

    }

    public void setCachorro(String nome) {

        this.nome = nome;

    }


    public void bebeu() {

        System.out.println("O cachorro bebeu água.");

    }


    public void latiu() {

        System.out.println("O cachorro latiu.");

    }


    public void lambeu() {

        System.out.println("Meu cachorro lambeu");

    }

    public void chamado() {

        System.out.println("Meu cachorro se chama " + getNome() + " e durante o dia: \n");
        bebeu();
        latiu();
        lambeu();

    }

    public static void main (String [] args) {

        /* Objeto */

        Cachorro cachorro = new Cachorro ("Gato");

        cachorro.chamado();;

    }

}