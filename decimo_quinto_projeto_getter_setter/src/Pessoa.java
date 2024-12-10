/* Sistema de Registro Detalhado de Pessoas

Desenvolver um sistema para registrar e gerenciar informações detalhadas sobre pessoas. O sistema deve validar os dados inseridos, utilizando lógica condicional (if e else) nos métodos setters.

Instruções:
Criação da Classe Pessoa:
Crie uma classe chamada Pessoa com os seguintes atributos privados:
Nome, idade, endereço, telefone, email, cpf, sexo, estadoCivil, profissão, salário, nacionalidade, filhos (representando a quantidade de filhos, ex.: "Nenhum", "Um", "Dois", etc.)

Construtor:
Implemente um construtor para a classe Pessoa que receba valores para todos os atributos e inicialize-os.

Métodos Getters e Setters:
Nome: O nome não pode ser vazio ou nulo.
Idade: A idade deve ser um valor positivo.
Endereço: Aceita qualquer String.
Telefone: Seu telefone.
E-mail: Que usuário digite seu e-mail.
CPF: Cpf do usuário.
Sexo:  Que usaurio digite o sexo.
Estado Civil: Deve ser "Solteiro", "Casado", "Divorciado" ou "Viúvo".
Profissão: Qual sua profissão.
Salário: Deve ser um valor positivo.
Nacionalidade: Aceita qualquer string.
Filhos: Deve ser uma string representando um número inteiro não negativo ou termos como
"Nenhum", "Um", "Dois", etc.

Dica: Em cada setter, utilize if e else para verificar se o valor atribuído é válido. Se não for, imprima uma mensagem de
erro ou ajuste o valor para um padrão.

Métodos Adicionais:
Método exibirDetalhes: Crie um método que retorna uma string com todos os detalhes da pessoa,
formatados de forma clara.
Método atualizarEndereco: Crie um método para atualizar o endereço da pessoa, recebendo o novo endereço
como parâmetro.

Testes: 
No método main:
Crie algumas instâncias da classe Pessoa.
Inicialize os atributos usando o construtor.
Use os getters para exibir as informações.
Utilize os setters para modificar alguns atributos, testando as validações com entradas válidas e inválidas.
Exiba os detalhes completos de cada pessoa usando o método exibirDetalhes.
Atualize o endereço de uma pessoa usando o método atualizarEndereco e exiba os detalhes atualizados.

Objetivo do Desafio: Visa reforçar a prática de encapsulamento, uso de métodos getters e setters com validação de dados, e aplicação de lógica condicional para garantir a integridade dos dados inseridos no sistema.

Sinta-se à vontade para incluir quaisquer atributos adicionais que considere relevantes. */

public class Pessoa {
    
    /* Atrinutos */

    private String Nome, filhos, endereco, telefone, email, cpf, sexo, estadoCivil, profissao, nacionalidade;
    private int idade;
    private double salario;

    /* Construtor de Blocos */

    public Pessoa (String Nome, int idade, String endereco, String telefone, String email, String cpf, String sexo, String estadoCivil, String profissao, double salario, String nacionalidade, String filhos) {

        this.Nome = Nome; 
        this.idade = idade;
        this.endereco = endereco; 
        this.telefone = telefone; 
        this.email = email;
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.salario = salario; 
        this.nacionalidade = nacionalidade;
        this.filhos = filhos;

    }

    public String getNome() {

        return Nome;

    }

    public void setNome(String Nome) {

        this.Nome = Nome;

        if (Nome == null) {

            System.out.println("Nome inválido!");

        }

        else {

            System.out.println("Nome: " + getNome());

        }

    }

    /* ====================================================================================================== */

    public int getIdade() {

        return idade;

    }

    public void setIdade(int idade) {

        this.idade = idade;

        if (idade > 0) {

            System.out.println("Idade: " + getIdade());

        }

        else {

            System.out.println("Sua idade está inválida!");

        }

    }

    /* ====================================================================================================== */


    public String getEndereco() {

        return endereco;

    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;

        if (endereco == null) {

            System.out.println("Endereço inválido!");

        }

        else {

            System.out.println("Endereço: " + getEndereco());

        }

    }

    /* ====================================================================================================== */

    public String getTelefone() {

        return telefone;

    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;

        if (telefone.length() == 16) {

            System.out.println("Telefone: " + getTelefone());

        }

        else {

            System.out.println("Número de telefone inválido!");
        }

    }

    /* ====================================================================================================== */

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

        if (email == null) {

            System.out.println("Email inválido!");

        }

        else {

            System.out.println("Email: " + getEmail());

        } 

    }

    /* ====================================================================================================== */

    public String getCpf() {

        return cpf;

    }

    public void setCpf(String cpf) {

        this.cpf = cpf;

        if (cpf.length() == 14) {

            System.out.println("CPF: " + getCpf());

        }

        else {

            System.out.println("Número inválido!");

        }

    }

    /* ====================================================================================================== */

    public String getSexo() {

        return sexo;

    }

    public void setSexo(String sexo) {

        this.sexo = sexo;

        if (sexo == "masculino" || sexo == "feminino") {

            System.out.println("Sexo: " + getSexo());

        }

        else {

            System.out.println("Sexualidade inválida!");

        }

    }

    /* ====================================================================================================== */

    public String getEstadoCivil() {

        return estadoCivil;

    }

    public void setEstadoCivil(String estadoCivil) {

        this.estadoCivil = estadoCivil;

        if (estadoCivil == "solteiro" || estadoCivil == "casado" || estadoCivil == "casada" || estadoCivil == "viúvo") {

            
        }

    }

    /* ====================================================================================================== */

    public String getProfissao() {

        return profissao;

    }

    public void setProfissao(String profissao) {

        this.profissao = profissao;

    }

    /* ====================================================================================================== */

    public double getSalario() {

        return salario;

    }

    public void setSalario(double salario) {

        this.salario = salario;

    }

    /* ====================================================================================================== */

    public String getNacionalidade() {

        return nacionalidade;

    }

    public void setNacionalidade(String nacionalidade) {

        this.nacionalidade = nacionalidade;

    }

    /* ====================================================================================================== */

    public String getFilhos() {

        return filhos;

    }

    public void setFilhos(String filhos) {

        this.filhos =  filhos;

    }

    /* ====================================================================================================== */
    /* ====================================================================================================== */

    /* Métodos Adicionais */

    public void exibirDetalhes() {

        getNome();
        getIdade();
        getCpf();
        getTelefone();
        getEmail();
        getCpf();
        getSexo();
        getEstadoCivil();
        getProfissao();
        getSalario();
        getNacionalidade();
        getFilhos();

    }

    /* Método main */
    
    /* public Pessoa (String Nome, int idade, String endereco, String telefone, String email, String cpf, String sexo, String estadoCivil, String profissao, double salario, String nacionalidade, String filhos) */
    
    public static void main (String [] args) {

        Pessoa pessoa = new Pessoa("Marcos", 28, "Guará, Distrito Federal", "(61) 91000-0000", "nodelayasdf@gmail.com", "012.133.211-23", "masculino", "casado", "Gerente de Projetos em TI", 15000, "brasileiro", "não");

        pessoa.setNome("Marcos");
        pessoa.setIdade(28);
        pessoa.setEndereco("Guará, Distrito Federal");
        pessoa.setTelefone("(61) 9 1000-0000");
        pessoa.setEmail("nodelayasdf@gmail.com");
        pessoa.setCpf("012.133.211-23");
        pessoa.setSexo("masculino");
        pessoa.setEstadoCivil("casado");
        pessoa.setProfissao("Gerente ");
        pessoa.setSalario(15000);
        pessoa.setNacionalidade("brasileiro");
        pessoa.setFilhos("não");
    
        pessoa.exibirDetalhes();

    }

}
