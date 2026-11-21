package q6;

public abstract class Veiculo {
    protected String modelo;
    protected int velocidadeAtual;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public abstract void acelerar();
}