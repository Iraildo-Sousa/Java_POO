public class Uzumaki extends ninja {
    
    String rasengan = "Atacou com um rasengan normal.";
    String odamaRasengan = "Atacou com um Odamarasengan";
    String rasenShuriken = "Atacou com um Rasenshuriken.";

    public void chakraInfinito() {

        System.out.println("Você é um Uzumaki por isso tem chakra infinito!");

    } /* public void chakraInfinito()  */

    @Override
    public void ataqueBase(){

        System.out.println("Sou um ninja Uzumaki por isso joguei uma kunai com estilo vento.");

    } /* public void ataqueBase() */


    public void ataqueBase(int chakraNivel){

        if (chakraNivel >= 2){

            System.out.println("Modo Bijuu ativado.");

        } /* if (chakraNivel >= 2) */

        else if (chakraNivel >= 1) {

            System.out.println("Modo Sennin ativado.");

        } /* else if (chakraNivel >= 1) */

        else {

            System.out.println("Nenhum modo ativado!");

        } /* else */
        

    } /* public void ataqueBase(int chakraNivel) */



}
