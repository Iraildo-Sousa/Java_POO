/* Crie uma nova classe Filme com os atributos públicos que contenha Titulo, Ator, Diretor  e escolha mais dois de sua escolha não esqueça de adicionar o método getter para esses atributos. No método main, crie um objeto "Filme" e exiba os valores desses atributos usando os getters. */

public class Filme {

    /* Atributos */

    public String titulo, sinopse, diretor, genero;
    public int ano_lancamento;

    /* Bloco de construção */

    public Filme (String titulo, String sinopse, String diretor, int ano_lancamento, String genero) {

        this.titulo = titulo;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.ano_lancamento = ano_lancamento;
        this.genero = genero;

    } /* public Filme (String titulo, String sinopse, String diretor, String ano_lancamento, String genero)  */
    
    /* Métodos Getter */

    public String getTitulo(){

        return titulo;
    } /* public String getTitulo() */

    public String getSinopse(){

        return sinopse;
    }

    public String getDiretor(){

        return diretor;
    }

    public int getAno_lancamento(){

        return ano_lancamento;
    }

    public String getGenero(){

        return genero;
    }

    /* Método main */

    public static void main(String[] args) {
        
        Filme Filme = new Filme("De Volta Para o Futuro", "O filme conta a história de Marty McFly (Michael J. Fox), um adolescente que inevitavelmente volta no tempo até 1955. Ele conhece seus futuros pais no colégio e acidentalmente faz sua futura mãe ficar romanticamente interessada por ele. Marty deve consertar o dano na história fazendo com que seus pais se apaixonem e, com a ajuda do Dr. Emmett Brown (Christopher Lloyd), encontrar um modo de voltar para 1985.", "Robert Zemeckis", 1985, "Ficção Científica");

        System.out.println("Título: " + Filme.getTitulo() + "\n\nSinopse: " + Filme.getSinopse() + "\n\nDiretor: " + Filme.getDiretor() + "\n\nGênero: " + Filme.getGenero());

    }

} /* public class Filme */
