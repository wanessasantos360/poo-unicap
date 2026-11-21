package q11;

public class ProdutoDigital extends Produto implements IDescontavel{

    public ProdutoDigital(String nome, double precoBase) {
        super(nome, precoBase);
    }
    

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }


    @Override
    public double aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido");
        }
        double valorDesconto = calcularPrecoFinal() * (percentual / 100.0);
        return calcularPrecoFinal() - valorDesconto ;
    }

    

}
