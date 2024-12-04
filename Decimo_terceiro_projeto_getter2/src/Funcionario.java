/* Exercícios 14 OOP - Crie uma classe Funcionario com os atributos nome e salario. Utilize métodos getter e setter para manipular esses atributos. No método main, defina os valores de nome e salario, e depois exiba-os. */

public class Funcionario {
    
    /* Atributos */

    private String nome;
    private double salario;

    /* Bloco de Construção */

    private Funcionario (String nome, int salario) {
    
        this.nome = nome;
        this.salario = salario;

    } /* public Funcionario (String nome, int salario) */

    /* Método getter */

    private String getNome () {

        return nome;

    } /* private String getNome () */

    private double getSalario () {

        return salario;

    } /* private double getSalario () */

    /* Método setter */

    private void setNome (String nome) {

        this.nome = nome;

    } /* private void setNome (String nome) */

    private void setSalario (double salario) {

        this.salario = salario;

    } /* private void setSalario (double salario)  */

    /* Método principal */

    public static void main(String[] args) {
        
        Funcionario fcamara = new Funcionario("Iraildo Sousa.", 5000);

        fcamara.setNome("Iraildo Sousa.");
        fcamara.setSalario(5000);

        System.out.println("Nome: " + fcamara.getNome());
        System.out.println("Salário R$" + fcamara.getSalario());

    }

} /* The end */
