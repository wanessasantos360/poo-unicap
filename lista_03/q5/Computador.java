package q5;

public class Computador implements ILigavel, IConectavel{
    @Override
    public void ligar() {
        System.out.println("Computador ligado. Carregando sistema operacional...");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado.");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Computador conectado à internet via Wi-Fi/Cabo.");
    }

}
