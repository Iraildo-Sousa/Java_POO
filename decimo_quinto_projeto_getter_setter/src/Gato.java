/* Exercícios 21 OOP - Criar uma classe "Gato" com atributos para nome e métodos comeu bebeu e miou. Não esqueça do Encapsulamento e  exibir as informações.

Exemplos de exibição:
- O Gato comeu
- O Gato bebeu
- O Gato miou */


public class Gato {

    /* Atributos */

    private String nome;

    /* Bloco de construção */

    public Gato (String nome) {

      this.nome = nome;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }


    public void bebeu() {

        System.out.println("O gato bebeu água.");

    }


    public void comeu() {

        System.out.println("O gato comeu.");

    }


    public void miou() {

        System.out.println("Meu gato miou.");

    }

    public void chamado() {

        System.out.println("Meu gato se chama " + getNome() + " e durante o dia: \n");
        bebeu();
        comeu();
        miou();

    }

    public static void main (String [] args) {

        /* Objeto */

        Gato gato = new Gato ("Cachorro");

        gato.chamado();;

    }

}