package dispositivo;

public class Celular extends Dispositivo {
    
    private String sistemaOP;

    /* Construtor de classe */

    public Celular (String marca, String modelo, String sistemaOP) {

        super(marca, modelo);
        this.sistemaOP = sistemaOP;

    }

    /* Get sistemaOP */

    public String getSistemaOP() {

        return sistemaOP;

    }

    /* Set sistemaOP */

    public void setSistemaOP (String sistemaOP) {

        this.sistemaOP = sistemaOP;

    }

    public void informacoes() {

        System.out.printf("Informações do Celular%n");
        super.informacoes();
        System.out.printf("Sistema OP: %s%n%n", sistemaOP);
        
    }

}
