package q5;

public class Roteador implements ILigavel, IConectavel {
    @Override
    public void ligar() {
        System.out.println("Roteador ligado. Iniciando Wi-Fi...");
    }

    @Override
    public void desligar() {
        System.out.println("Roteador desligado.");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Roteador conectado à rede externa do provedor.");
    }
}
