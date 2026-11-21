package q6;

public class CarroEletrico extends Veiculo implements Eletrico {

    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        this.velocidadeAtual += 15;
        System.out.printf("%s (Elétrico) acelerou! Velocidade atual: %d km/h%n", 
                          this.modelo, this.velocidadeAtual);
    }

    @Override
    public void carregarBateria() {
        System.out.printf("Carregando a bateria do %s... Carga completa!%n", this.modelo);
    }
}