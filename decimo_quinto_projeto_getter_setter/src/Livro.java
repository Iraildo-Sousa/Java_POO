/* Exercícios 18 OOP - Criar uma classe Livro com atributos para título e número de páginas, garantindo que o número de páginas seja maior que 10.

1 - Crie a classe Livro com os seguintes atributos privados:
    • titulo (String)
    • numeroPaginas (int)
2 - Implemente os métodos setter e getter para os atributos:
    • setTitulo(String titulo): Define o título do livro.
    • getTitulo(): Retorna o título do livro.
    • setNumeroPaginas(int numeroPaginas): Define o número de páginas, garantindo que seja maior que 10.
    • getNumeroPaginas(): Retorna o número de páginas.
3 -  No método main, crie uma instância de Livro, defina o título e o número de páginas, e exiba esses valores. */

public class Livro {

    /* Atributos */

    private String titulo;
    private int numeroPaginas;

    /* Construtor de Blocos */

    public Livro (String titulo, int numeroPaginas) {

        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;

    }

    /* Método get */

    public String getTitulo() {

        return titulo;

    }

    /* Método set */

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    } 

    /* Método get */

    public int getNumeroPaginas() {

        return numeroPaginas;

    }
    
    /* Método set */

    public void setNumeroPaginas(int numeroPaginas) {

        this.numeroPaginas = numeroPaginas;

    }

    /* Método main */

    public static void main(String[] args) {
        
        Livro Livro = new Livro("Romeu e Julieta", 128);

        System.out.println("Nome do livro: " + Livro.getTitulo() + "\nNúmero de páginas: " + Livro.getNumeroPaginas());

    }

} /* public class Livro  */