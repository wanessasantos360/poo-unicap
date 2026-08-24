//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Instanciar objeto
        Filme f1 = new Filme("Interestelar", "Ficção Científica", 2014);
        Filme f2 = new Filme("Toy Story", "Animação", 1995);
        System.out.println("___________________________________");

        // Print dos filmes
        System.out.println("Nome do filme \t | \t Genero \t | \t Ano de lançamento ");
        System.out.printf("%s \t | \t %s \t | \t %d \n", f1.getTitulo(), f1.getGenero(), f1.getAnoLancamento());
        System.out.printf("%s \t | \t %s \t | \t %d \n", f2.getTitulo(), f2.getGenero(), f2.getAnoLancamento());

        // Livros
        Livro l1 = new Livro();



    }
}