import animais.*;

public class Polimorfismo {
    
    public static void main(String[] args) {
        
        Animais[] animais = new Animais[3];

            animais[0] = new Cachorro("Rex");
            animais[1] = new Gato("Mimi");
            animais[2] = new Cachorro("Max");

            for (Animais animal : animais) {

                animal.comer();
                animal.beber();

            }

    }

}
