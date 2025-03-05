import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Create - Adicionar um novo livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    // Read - Listar todos os livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    // Read - Buscar livro por ID
    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    // Update - Atualizar um livro existente
    public void atualizarLivro(int id, String novoTitulo, String novoAutor, int novoAnoPublicacao) {
        Livro livro = buscarLivroPorId(id);
        if (livro != null) {
            livro.setTitulo(novoTitulo);
            livro.setAutor(novoAutor);
            livro.setAnoPublicacao(novoAnoPublicacao);
            System.out.println("Livro atualizado com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // Delete - Remover um livro por ID
    public void removerLivro(int id) {
        Livro livro = buscarLivroPorId(id);
        if (livro != null) {
            livros.remove(livro);
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}