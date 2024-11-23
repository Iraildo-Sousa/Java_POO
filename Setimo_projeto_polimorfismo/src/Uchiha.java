public class Uchiha extends ninja {

    String sharingan1 = "Nível 1";
    String sharingan2 = "Nível 2";
    String sharingan3 = "Nível 3";
    
    public void sharinganAtivado() {

        System.out.println("Sharingan ativado para um Uchiha!");


    } /* public void sharinganAtivado()  */


    public void ataqueBase(){

        System.out.println("Sou um ninja Uchiha por isso joguei uma kunai com estilo fogo.");

    } /* public void ataqueBase() */


    public void ataqueBase(int chakraNivel){

        if (chakraNivel >= 2) {
        
            System.out.println("Susano ativado.");

        } /* if (chakraNivel2 >= 2) { */

        else if (chakraNivel >= 1){

            System.out.println("Você ativou apenas o charingan.");

        } /* else if (chakraNivel >= 1) */
        
        else {

            System.out.println("Você não ativou nada!");

        } /* else */
        
    } /* public void ataqueBase() */


} /* public class Uchiha extends ninja  */
