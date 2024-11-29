public class Livro {
    
    public String titulo;
    public String autor;
    public int quantidade_de_paginas;
    public String editora;
    public double preco;
    public String traducao;
  
    public Livro(String titulo, String autor, int quantidade_de_paginas, String editora, double preco, String traducao) {

        this.titulo = titulo;
        this.autor = autor;
        this.quantidade_de_paginas = quantidade_de_paginas;
        this.editora = editora;
        this.preco = preco;
        this.traducao = traducao;


    }

    public String getTitulo(){

        return titulo;
    }

    public String getAutor(){

        return autor;
    }

    public int getQuantidade_de_paginas() {

        return quantidade_de_paginas;
    }

    public String getEditora() {

        return editora;
    }

    public double getPreco() {

        return preco;
    }


    public String getTaducao() {

        return traducao;
    }


    public static void main(String[] args) {
        
        Livro biblioteca = new Livro ("Maus", "Art Spiegelman", 296, "Revista Raw", 60, "Inglês");
        System.out.println("Título: " + biblioteca.getTitulo() + "\nAutor: " + biblioteca.getAutor() + "\nQuantidade de páginas: " + biblioteca.getQuantidade_de_paginas() + "\nEditora: " + biblioteca.getEditora() + "\nPreço: R$ " + biblioteca.getPreco() + "\nTradução: " + biblioteca.getTaducao());

    } /* public static void main(String[] args) */

}
