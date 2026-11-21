package q6;

public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        this.velocidadeAtual += 10;
        System.out.printf("%s acelerou! A velocidade atual: %d km/h%n", 
                          this.modelo, this.velocidadeAtual);
    }
}