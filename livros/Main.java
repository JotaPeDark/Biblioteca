public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar livros
        biblioteca.adicionarLivro(new Livro(1, "Dom Casmurro", "Machado de Assis", 1899));
        biblioteca.adicionarLivro(new Livro(2, "1984", "George Orwell", 1949));

        // Listar livros
        System.out.println("Lista de livros:");
        biblioteca.listarLivros();

        // Buscar livro por ID
        System.out.println("\nBuscando livro com ID 1:");
        Livro livro = biblioteca.buscarLivroPorId(1);
        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado.");
        }

        // Atualizar livro
        System.out.println("\nAtualizando livro com ID 1:");
        biblioteca.atualizarLivro(1, "Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        biblioteca.listarLivros();

        // Remover livro
        System.out.println("\nRemovendo livro com ID 2:");
        biblioteca.removerLivro(2);
        biblioteca.listarLivros();
    }
}