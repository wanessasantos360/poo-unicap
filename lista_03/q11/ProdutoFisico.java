package q11;

public class ProdutoFisico extends Produto{

    public ProdutoFisico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase()+ 15;
    }


}
