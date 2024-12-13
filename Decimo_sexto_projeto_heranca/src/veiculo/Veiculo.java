package veiculo;

public class Veiculo {
    
    private String marca;
    private int ano;

    /* Contrutor de classe */

    public Veiculo(String marca, int ano) {

        this.marca = marca;
        this.ano = ano;

    }

    /* Get */

    public String getMarca() {

        return marca;

    }

    /* Set */

    public void setMarca(String marca) {

        this.marca = marca;

    }

    /* Get */

    public int getAno() {

        return ano;

    }

    public void setAno(int ano) {

        this.ano = ano;

    }

    public void detalhes() {

        System.out.printf("%nMarca: %s%nAno: %d%n", marca, ano);

    }

}
