package q11;

public class Main {
    public static void main(String[] args) {
        try{
            Produto p1 = new ProdutoFisico("Mouse", 100);
            System.out.print("| Nome do produto \t | Preço final \t |\n");
            System.out.println("| "+p1.getNome() +"\t\t\t | "+ p1.calcularPrecoFinal() + "\t |");

            ProdutoDigital p2 = new ProdutoDigital("E-book javanauta", 100);
            System.out.println(p2.getNome());
            System.out.println(p2.calcularPrecoFinal());
            System.out.println(p2.aplicarDesconto(20));

            // Desconto acima do limite
            System.out.println(p2.aplicarDesconto(110));

        } catch (IllegalArgumentException e) {
            System.err.println("Erro no pedido: " + e.getMessage());
        }
    }
}
