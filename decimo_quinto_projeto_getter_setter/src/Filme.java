/* Exercícios 19 OOP - Criar uma classe Filme com atributos para título e classificação indicativa, garantindo que a classificação 18 anos.
1 - Crie a classe Filme com os seguintes atributos privados:
    • titulo (String)
    • classificacaoIndicativa (int)
2 - Implemente os métodos setter e getter para os atributos:
    • setTitulo(String titulo): Define o título do filme.
    • getTitulo(): Retorna o título do filme.
    • setClassificacaoIndicativa(int classificacaoIndicativa): Define a classificação indicativa, garantindo que esteja maior que 18 anos.
    • getClassificacaoIndicativa(): Retorna a classificação indicativa.
3 - No método main, crie uma instância de Filme, defina o título e a classificação indicativa, e exiba esses valores.

Sinta-se à vontade para incluir quaisquer atributos adicionais que considere relevantes. */

public class Filme {
    
    /* Atributos */

    private String titulo;
    private int classificacaoIndicativa;

    /* Bloco construcao */

    public Filme (String titulo, int classificacaoIndicativa) {

        this.titulo = titulo;
        this.classificacaoIndicativa = classificacaoIndicativa;

        if (classificacaoIndicativa >= 18) {

            System.out.println("Filme liberado!");

        }

        else {

            System.out.println("Você não é maior de idade. Saia daqui fedelho!");

        }

    }

    public String getTitulo() {
       
        return titulo;
        
    } /* public String getTitulo() */

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    } /* public void setTitulo(String titulo)  */


    public int getClassificacaoIndicativa() {

        return classificacaoIndicativa;

    } /* public int getClassificacaoIndicativa() */


    public void setClassificacaoIndicativa(int classificacaoIndicativa) {

        this.classificacaoIndicativa = classificacaoIndicativa;

    } /* public void setClassificacaoIndicativa(int classificacaoIndicativa)  */


    public static void main(String[] args) {
        
        /* Objeto */

        Filme Filme = new Filme ("Jogos Mortais", 18);

        System.out.println("Filme: " + Filme.getTitulo() + "\nClassificação: " + Filme.getClassificacaoIndicativa());


    }


} /* public class Filme */
