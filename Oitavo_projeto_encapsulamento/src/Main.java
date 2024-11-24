public class Main {
    
    public static void main(String[] args) {
        
        /* objeto 1 */
        Uzumaki naruto = new Uzumaki();
        /*naruto.nome = "Naruto Uzumaki";*//* agora está com get e set */
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        System.out.println("Meu nome é " + naruto.getNome() + ".");
        naruto.idade = 16;
        naruto.chakraInfinito();
        naruto.ataqueBase();
        naruto.ataqueBase(0);
        naruto.ataqueBase(1);
        naruto.ataqueBase(2);
        

        /* objeto 2 */
        Uchiha sasuke = new Uchiha();
        /* sasuke.nome = "Sasuke Uchiha";*//* agora está com get e set */
        sasuke.setNome("Sasuke Uchiha");
        sasuke.getNome();
        System.out.println("Meu nome é " + sasuke.getNome() + ".");
        sasuke.sharinganAtivado();
        sasuke.sharingan1 = "";
        sasuke.ataqueBase();
        sasuke.ataqueBase(0);
        sasuke.ataqueBase(1);
        sasuke.ataqueBase(2);
        
        
    } /* public static void main(String[] args) */

} /* public class Main */
