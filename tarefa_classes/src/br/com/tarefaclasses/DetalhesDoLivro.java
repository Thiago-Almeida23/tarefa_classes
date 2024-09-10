package br.com.tarefaclasses;

public class DetalhesDoLivro {

    // Propriedades do livro
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String genero;

    // Construtor para inicializar os detalhes do livro
    public DetalhesDoLivro(String titulo, String autor, int numeroPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
