package q9;

public class Livro {
    private String titulo;
    private int exemplaresDisponiveis;

    public Livro(String titulo, int exemplaresDisponiveis) {
        if (exemplaresDisponiveis < 0) {
            throw new IllegalArgumentException("A quantidade inicial de exemplares não pode ser negativa.");
        }
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void emprestar() throws LivroIndisponivelException {
        if (this.exemplaresDisponiveis <= 0) {
            throw new LivroIndisponivelException(
                "Não há exemplares disponíveis do livro \"" + this.titulo + "\" para empréstimo."
            );
        }

        this.exemplaresDisponiveis--;
        System.out.printf("Empréstimo realizado: \"%s\" | Exemplares restantes: %d%n",
                          this.titulo, this.exemplaresDisponiveis);
    }
}