package dispositivo;

public class Laptop extends Dispositivo {

    private int memoriaRAM;

    /* Construtor de classes */

    public Laptop (String marca, String modelo, int memoriaRAM) {

        super(marca, modelo);
        this.memoriaRAM = memoriaRAM;

    }

    public int getMemoriaRAM() {

        return memoriaRAM;

    }

    public void setMemoriaRAM(int memoriaRAM) {

        this.memoriaRAM = memoriaRAM;

    }

    public void informacoes() {

        System.out.printf("%nInformações do Laptop%n%n");
        super.informacoes();
        System.out.printf("Memória RAM: %s%n%n", memoriaRAM);

    }
    
}
