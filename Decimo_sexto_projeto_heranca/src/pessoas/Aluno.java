package pessoas;

public class Aluno extends Pessoa {

    /* Atrinutos */

    private String curso;

    /* Construtor de classe */
    
    public Aluno(String nome, int idade, String curso) {

        super(nome, idade);
        this.curso = curso;

    }

    public String getCurso() {

        return curso;

    }    

    public void setCurso(String curso) {

        this.curso = curso;

    }

    public void apresentar() {

        super.apresentar();
        System.out.printf("%nCurso: %s%n%n", curso);

    }



}
