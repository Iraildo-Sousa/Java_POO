public class carro {
    
    /* Atributos da classe "carro" */

    String marca;
    String modelo;
    String cor;

    /* Métodos do carro */

    void acelerar(){

        System.out.println("O carro está acelerando.");

    }/* void acelerar */

    void freiar(){

        System.out.println("O carro está freiando.");

    }/* void freiar() */

    void virar(String direcao){

        System.out.println("O carro está virando para direção. " + direcao + ".");

    } /* void virar() */
}
