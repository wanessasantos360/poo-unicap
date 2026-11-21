package q9;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Estruturas de Dados e Algoritmos em Java", 2);

        System.out.printf("Livro cadastrado: \"%s\" | Exemplares iniciais: %d%n%n",
                          livro.getTitulo(), livro.getExemplaresDisponiveis());

        // Tentando realizar 3 empréstimos seguidos
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            try {
                System.out.println("Tentativa de empréstimo #" + tentativa + "...");
                livro.emprestar();
            } catch (LivroIndisponivelException e) {
                System.err.println("Falha no empréstimo: " + e.getMessage());
            }
        }
    }
}