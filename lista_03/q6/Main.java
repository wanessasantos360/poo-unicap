package q6;

public class Main {
    public static void main(String[] args) {
        Carro carroComum = new Carro("Virtus");
        CarroEletrico carroEletrico = new CarroEletrico("BYD");

        System.out.println("# Carro a Combustão");
        carroComum.acelerar();
        carroComum.acelerar();

        System.out.println("\n#Teste do Carro Elétrico ");
        carroEletrico.carregarBateria();
        carroEletrico.acelerar();
        carroEletrico.acelerar();
    }
}