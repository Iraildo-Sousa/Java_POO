import banco.Conta_Corrente;
import banco.Conta_Poupanca;

public class Apresentar_banco {
    
    public static void main(String[] args) {
        
        Conta_Corrente conta = new Conta_Corrente("484148123456", 500, 5000);
        Conta_Poupanca conta2 = new Conta_Poupanca("484148123456", 500, 5000);
        
        conta.exibirDetalhes2();
        conta2.exibirDetalhes3();

    }

}
