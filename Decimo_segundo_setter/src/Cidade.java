public class Cidade {
    
    private String nome;
    private int populacao;


    /* Construtor */

    public Cidade (String nome, int populacao){

        this.nome = nome;
        this.populacao = populacao;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setPopulacao(int populacao){

        this.populacao = populacao;

    }

    public String getNome(){

        return nome;

    }

    public int getPopulacao(){

        return populacao;

    }

    public static void main(String[] args) {
        
        Cidade planaltina = new Cidade("Planaltina", 250000);
        planaltina.setPopulacao(250000);
        planaltina.setNome("PLanaltina");

        System.out.println("Nome da cidade: " + planaltina.getNome() + ".\nPopulação: " + planaltina.getPopulacao() + " pessoas." );


        
    }

}
