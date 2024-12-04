/* Exercícios 15 OOP - Crie uma classe em Java chamada "SeuNome" com uma variedade de atributos, como nome, idade, profissão, endereço, telefone, email, se possui carro, e salário. Para cada atributo, inclua métodos para acessar (getters) e modificar (setters) os valores. No método main, crie uma instância dessa classe, defina valores para seus atributos, e exiba esses valores na saída padrão. Sinta-se à vontade para incluir quaisquer atributos adicionais que considere relevantes. */

/* Nome: João Silva
Idade: 30 anos
Profissão: Engenheiro
Endereço: Rua Exemplo, 123, São Paulo - SP
Telefone: (11) 99999-9999
Email: joao.silva@email.com
Possui Carro: Sim
Salário: R$ 5.000,00 */

import java.util.Scanner;

public class SeuNome {
    
    private String nome, endereco, email, carro, telefone;
    private int idade;
    private double salario;


    /* Bloco de construção */

    private SeuNome (String nome, int idade, String endereco, String telefone, String email, String carro, double salario) {

        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.carro = carro;
        this.salario = salario;

    } /* private SeuNome (String nome, int idade, String endereco, double telefone, String email, String carro, double salario)  */

    /* Método setter */

    private void setNome (String nome) {

    /*      this.nome = nome;

        if (nome == "João Silva") {

            System.out.println("Seu nome é João Silva!");

        }

        else {

            System.out.println("Seu nome não é esse.");

        }
    */

    }

    private void setIdade (int idade) {

        this.idade = idade;

    }

    private void setEndereco (String endereco) {

        this.endereco = endereco;

    }

    private void setTelefone (String telefone) {

        this.telefone = telefone;

    }

    private void setEmail (String email) {

        this.email = email;

    }

    private void setCarro (String carro) {

        this.carro = carro;

    }
    
    private void setSalario (double salario) {

        this.salario = salario;

    }

    /* Método getter */

    private String getNome () {

        return nome;

    }

    private int getIdade () {

        return idade;

    }

    private String getEndereco () {

        return endereco;

    }

    private String getTelefone () {

        return telefone;

    }

    private String getEmail () {

        return email;

    }

    private String getCarro () {

        return carro;

    }
    
    private double getSalario () {

        return salario;

    }

    /* Método Principal */

    public static void main(String[] args) {
        
        SeuNome pessoa = new SeuNome("João Silva", 30, "Rua Constatino, 101, São Paulo - SP", "11999999999", "joao.silva@gmail.com", "Sim", 52000);

        pessoa.setNome("João Silva");
        pessoa.setIdade(30);
        pessoa.setEndereco("Rua Constatino, 101, São Paulo - SP");
        pessoa.setTelefone("(11) 9 9999-9999");
        pessoa.setEmail("joao.silva@gmail.com");
        pessoa.setCarro("Sim");
        pessoa.setSalario(52000);

        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nEndereço: " + pessoa.getEndereco() + "\nTelefone: " + pessoa.getTelefone() + "\nEmail: " + pessoa.getEmail() + "\nCarro: " + pessoa.getCarro() + "\nSalário: R$ " + pessoa.getSalario());

    }


}
