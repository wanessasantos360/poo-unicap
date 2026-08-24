public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro \t\t | \t Ano de Publicação \t | \t Autor" +
                "\n"+ titulo + "\t\t | \t" + anoPublicacao + "\t\t | \t" + autor.toString() + "\n";
    }
}
