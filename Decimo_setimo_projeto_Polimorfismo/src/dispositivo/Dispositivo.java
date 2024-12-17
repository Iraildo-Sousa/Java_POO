package dispositivo;

public class Dispositivo {

    private String marca;
    private String modelo;

    /* Construtor de classe */

    public Dispositivo (String marca, String modelo) {

        this.marca = marca;
        this.modelo = modelo;

    }

    public String getMarca() {

        return marca;

    }

    public void setMarca(String marca) {

        this.marca = marca;

    }

    public String getModelo() {

        return modelo;

    }

    public void setModelo(String modelo) {

        this.modelo = modelo;

    }

    public void informacoes() {

        System.out.printf("%nMarca: %s%nModelo: %s%n", marca, modelo);

    }
    
}
