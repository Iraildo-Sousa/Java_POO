package pessoas;

public class Professor extends Pessoa {

    private String disciplina;

    /* Construtor de classe */

    public Professor (String nome, int idade, String disciplina) {

        super (nome, idade);
        this.disciplina = disciplina;

    }

    /* Get */
    
    public String getDisciplina() {
      
        return disciplina;
    
    }

    /* Set */

    public void setDisciplina(String disciplina) {
       
        this.disciplina = disciplina;
    
    }

    public void apresentar2() {

        super.apresentar();
        System.out.printf("%nDisciplina: %s%n", disciplina);

    }    

    
}
