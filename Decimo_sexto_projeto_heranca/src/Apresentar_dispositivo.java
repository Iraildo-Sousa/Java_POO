import dispositivo.Celular;
import dispositivo.Laptop;

public class Apresentar_dispositivo {

    public static void main(String[] args) {
        
    
        Celular celular = new Celular("Samsung", "Grand Prime", "Ubuntu");
        Laptop laptop = new Laptop("Dell", "XPS 13 9310", 10);

        celular.informacoes();
        laptop.informacoes();

    }

}