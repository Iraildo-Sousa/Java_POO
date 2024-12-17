package animais;

public class Animais {
    
    /* Atributos */

    private String nome;

    /* Construtor de classe */

    public Animais (String nome) {

        this.nome = nome;

    }

    /* Métodos */

    public void comer() {

        System.out.printf("%s comeu\n", nome);

    }

    public void beber() {

        System.out.printf("%s bebeu\n", nome);

    }

    public String getNome() {

        return nome;
    
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

}
