package animais;

public class Gato extends Animais {
    
    /* Constutor de Blocos */

    public Gato (String nome) {

        super(nome);

    }

    public void lamber() {

        System.out.printf("O %s lambeu.", getNome());

    }

    public void miar() {

        System.out.printf("O %s miou.\n", getNome());

    }


}
