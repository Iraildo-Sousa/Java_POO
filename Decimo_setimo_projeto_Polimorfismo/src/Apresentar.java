import animais.Gato;
import animais.Cachorro;

public class Apresentar {
    
    public static void main(String[] args) {
        
        Gato gato = new Gato("Leão");
        Cachorro cachorro = new Cachorro("Gatinho");

        gato.beber();
        gato.comer();
        gato.miar();
        gato.lamber();

        System.out.printf("\n\n");

        cachorro.beber();
        cachorro.comer();
        cachorro.latir();
        cachorro.lamber();

    }

}
