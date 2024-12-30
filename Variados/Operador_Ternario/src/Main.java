public class Main {

    private int nota;

    public Main (int nota) {

        this.nota = nota;

        if ( nota >= 6 ) {

            System.out.printf("Aprovado!\n");

        }

        else {

            System.out.printf("Reprovado!\n");

        }

        System.out.println(nota >= 6 ? "Aprovado!\n" 
        : nota >= 3 && nota <= 5 ? "Recuperação!\n" 
        : nota >= 0 && nota <= 2 ? "Reprovado!\n" 
        : "Nota inválida\n");

    }

    public int getNota () {

        return nota;

    }

    public void setNota (int nota) {

        this.nota = nota;
        

    }

    public static void main (String[] args) {

        Main gabi = new Main(-15);

        gabi.getNota();

    } 
    
}
