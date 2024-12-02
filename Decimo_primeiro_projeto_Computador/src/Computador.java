public class Computador {

    /* Atributos do objeto */ 

    public int memoria_ram, hd;
    public String sistema_operacional, placa_mae;

    /* Construtor de Blocos */

    public Computador (int memoria_ram, int hd, String sistema_operacional, String placa_mae){

        this.memoria_ram = memoria_ram;
        this.hd = hd; 
        this.sistema_operacional = sistema_operacional;
        this.placa_mae = placa_mae;

    } /* public Computador */

    /* Método get */

    public int getMemoria_ram(){

        return memoria_ram;

    } /* public int getMemoria_ram() */

    public int getHd(){

        return hd;

    }

    public String getSistema_operacional(){

        return sistema_operacional;

    }

    public String getPlaca_mae(){

        return placa_mae;

    }

    /* Método main */

    public static void main(String[] args) {
        
        Computador Computador = new Computador(10, 880, "Linux Ubuntu", "Positivo");

        System.out.println("Memória RAM: " + Computador.getMemoria_ram());
        System.out.println("HD: " + Computador.getHd());
        System.out.println("Sistema Operacional: " + Computador.getSistema_operacional());
        System.out.println("Placa mãe: " + Computador.getPlaca_mae());

    }

} /* public class Computador */