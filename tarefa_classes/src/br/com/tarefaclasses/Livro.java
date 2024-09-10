package br.com.tarefaclasses;

public class Livro {

    // Propriedade que armazena os detalhes do livro
    private DetalhesDoLivro detalhes;

    // Construtor para inicializar o objeto Livro com seus detalhes
    public Livro(DetalhesDoLivro detalhes) {
        this.detalhes = detalhes;
    }

    // Método para simular a leitura do livro
    public void ler() {
        System.out.println("Lendo o livro: " + detalhes.getTitulo() + ".");
    }

    // Método para simular a abertura do livro
    public void abrir() {
        System.out.println("Abrindo o livro " + detalhes.getTitulo());
    }

    // Método para simular o fechamento do livro
    public void fechar() {
        System.out.println("Fechando o livro " + detalhes.getTitulo());
    }

    // Método para acessar os detalhes do livro
    public DetalhesDoLivro getDetalhes() {
        return detalhes;
    }
}

