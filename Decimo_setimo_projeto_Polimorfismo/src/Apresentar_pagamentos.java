import pagamento.Boleto;
import pagamento.Cartao_credito;
import pagamento.Pix;

public class Apresentar_pagamentos {

    public static void main(String[] args) {
        
        Boleto boleto = new Boleto(50, 5);
        Cartao_credito credito = new Cartao_credito(50, 5);
        Pix pix = new Pix(50, 5);

        boleto.realizar_pagamento2();
        credito.realizar_pagamento1();
        pix.realizar_pagamento3();

    }

} 