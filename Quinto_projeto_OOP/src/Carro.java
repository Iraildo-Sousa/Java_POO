public class Carro {
    
    /* Atributos da classe "carro" */

    String marca;
    String modelo;
    String cor;

    /* Métodos do carro */
    

    void acelerar(){

        System.out.println("O carro está acelerando.");

    }/* void acelerar */

    void freiar(){

        System.out.println("O carro está freando.");

    }/* void freiar() */

    void virar(String direcao){

        System.out.println("O carro está virando para direção. " + direcao + ".");

    } /* void virar() */

    /* Método principal para executar o programa */

    public static void main(String[] args) throws Exception {


        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Uno";
        meuCarro.cor = "Verde";

        /* Informações sobre o carro */

        System.out.println("Meu carro é " + meuCarro.marca + " e o modelo " + meuCarro.modelo + " de cor " + meuCarro.cor + ".");
        
        /* Chamando os métodos do OBJETO */

        meuCarro.acelerar();
        meuCarro.freiar();
        meuCarro.virar("\nDireita");
        meuCarro.virar("\nEsquerda");

    } /* public static void main(String[] args) throws Exception  */

}
