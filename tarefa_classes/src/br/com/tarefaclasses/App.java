package br.com.tarefaclasses;

public class App {

    public static void main(String[] args) {
        // Criando um objeto DetalhesDoLivro
        DetalhesDoLivro detalhes = new DetalhesDoLivro("Dom Quixote", "Miguel de Cervantes", 863, "Romance");

        // Criando um objeto Livro com os detalhes
        Livro livro = new Livro(detalhes);

        // Exibindo os detalhes do livro
        exibirDetalhesDoLivro(livro);

        // Executando os métodos do objeto livro
        livro.abrir();
        livro.ler();
        livro.fechar();
    }

    // Método para exibir os detalhes do livro
    public static void exibirDetalhesDoLivro(Livro livro) {
        DetalhesDoLivro detalhes = livro.getDetalhes();
        System.out.println("Detalhes do Livro:");
        System.out.println("Título: " + detalhes.getTitulo());
        System.out.println("Autor: " + detalhes.getAutor());
        System.out.println("Número de Páginas: " + detalhes.getNumeroPaginas());
        System.out.println("Gênero: " + detalhes.getGenero());
        System.out.println();
    }
}
