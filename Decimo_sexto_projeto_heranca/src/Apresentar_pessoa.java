import pessoas.Aluno;
import pessoas.Professor;

public class Apresentar_pessoa {
 
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Iraildo Sousa", 25, "Desenvolvimento de Sistemas");
        Professor professor = new Professor("Rafael Bomfin", 39, "Desenvolvimento de Sistemas");

        aluno.apresentar(); 
        professor.apresentar2();
    }
    
}
