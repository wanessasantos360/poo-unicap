package q11;

public abstract class Produto {
    //nome, precoBase e método abstrato calcularPrecoFinal()
    private String nome;
    private  double precoBase;

    public Produto(String nome, double precoBase){
        if (precoBase < 0) {
            throw new IllegalArgumentException("O preço-base não pode ser negativo.");
        }
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();
    
}
