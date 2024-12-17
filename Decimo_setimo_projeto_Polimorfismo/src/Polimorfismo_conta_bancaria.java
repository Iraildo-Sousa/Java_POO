import banco.*;

public class Polimorfismo_conta_bancaria {
    
    public static void main (String [] args) {

        Conta_Bancaria [] conta = new Conta_Bancaria [3];

        conta[0] = new Conta_Bancaria("1546543324-5", 1000);
        conta[1] = new Conta_Corrente("1213543545-4", 1500, 5000);
        conta[2] = new Conta_Poupanca("1245635454-7", 2000, 5000);

        for (Conta_Bancaria informacoes : conta) {

            informacoes.exibirDetalhes();


        }

    }

}
