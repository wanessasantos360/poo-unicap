//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Instanciar objeto
        Filme f1 = new Filme("Interestelar", "Ficção Científica", 2014);
        Filme f2 = new Filme("Toy Story", "Animação", 1995);
        System.out.println("________________Filmes___________________");

        // Print dos filmes
        System.out.println("Nome do filme \t | \t Genero \t | \t Ano de lançamento ");
        System.out.printf("%s \t | \t %s \t | \t %d \n", f1.getTitulo(), f1.getGenero(), f1.getAnoLancamento());
        System.out.printf("%s \t | \t %s \t | \t %d \n", f2.getTitulo(), f2.getGenero(), f2.getAnoLancamento());
        System.out.println();


        // Autores
        System.out.println("________________Livros___________________");
        Autor a1 = new Autor("George Orwell", "Britânico");
        Autor a2 = new Autor("Machado de Assis", "Brasileiro");

        // Livros
        Livro l1 = new Livro("1984", 1949, a1);
        Livro l2 = new Livro("Dom Casmurro", 1899, a2);

        System.out.println(l1);
        System.out.println(l2);





    }
}