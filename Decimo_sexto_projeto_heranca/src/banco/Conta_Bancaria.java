/* Exercícios 23 OOP -  Crie uma superclasse "ContaBancaria" e duas subclasses "ContaCorrente" e "ContaPoupanca", que herdam de "ContaBancaria". Implemente construtores nas subclasses e métodos para exibir os detalhes das contas.

Passos:
Classe ContaBancaria:
    -Atributos: numero (String), saldo (double).
   - Método: exibirDetalhes(), que exibe o número da conta e o saldo.

Classe ContaCorrente (herda de ContaBancaria):
    -Atributo adicional: limite (double).
    -Construtor: Inicializa o número, o saldo e o limite.
    -Método sobrescrito: exibirDetalhes(), que exibe todos os detalhes da classe base e o limite.

Classe ContaPoupanca (herda de ContaBancaria):    -Atributo adicional: taxaDeJuros (double).
    -Construtor: Inicializa o número, o saldo e a taxa de juros.
   -Método sobrescrito: exibirDetalhes(), que exibe todos os detalhes da classe base e a taxa de juros.

Classe Principal App:
   -Crie instâncias de ContaCorrente e ContaPoupanca, e chame o método exibirDetalhes() para cada uma. */

package banco;

public class Conta_Bancaria {
    
    private String numero_conta;
    private double saldo;

    /* Construtor de classe */

    public Conta_Bancaria (String numero_conta, double saldo) {

        this.numero_conta = numero_conta;
        this.saldo = saldo;

    }

    /* Get numero_conta */

    public String getNumero_conta() {

        return numero_conta;

    }

    /* Set numero_conta */ 

    public void setNumero_conta(String numero_conta) {

        this.numero_conta = numero_conta;

    }

    /* Get saldo */

    public double getSaldo() {

        return saldo;

    }

    /* Set saldo */

    public void setSaldo(double saldo) {
        
        this.saldo = saldo;

    }

    public void exibirDetalhes() {

        System.out.printf("Número da conta: %s%nSaldo: %.2f", numero_conta, saldo);

    } 


}
