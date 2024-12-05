public class Pessoa {
    
    private String nome;
    private int idade;
 /* private int c;
    private int c2; */ 

    private Pessoa (String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

        if (idade >= 0 && idade <= 18) {

            System.out.println("Você ainda não é maior de idade.");

        }

        else if (idade > 18) {

            System.out.println("Você já é maior de idade.");

        }

        else {

            System.out.println("Idade inválida!");

        }

        /* Contador */

     /* System.out.println("Vamos fazer uma contagem de 1 a 10");

        for (c = 1; c <= 10; c++) {

            System.out.print(c + " ");
            
        } */

    }

    private String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    private int getIdade() {

        return idade;

    }

 /* private void setIdade(int idade) {

        this.idade = idade;

        
    } */

    public static void main (String [] args) {

        Pessoa aluno = new Pessoa ("Iraildo Sousa", -15);

        /* aluno.setNome("Iraildo Sousa");
           aluno.setIdade(25); */

        System.out.println("\nNome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade());

    }

}
