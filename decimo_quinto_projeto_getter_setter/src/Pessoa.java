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

    

    
}
