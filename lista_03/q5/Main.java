package q5;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        Roteador roteador = new Roteador();
        Computador pc = new Computador();

        System.out.println("# Televisão ");
        tv.ligar();
        tv.desligar();

        System.out.println("\n# Roteador ");
        roteador.ligar();
        roteador.conectarInternet();
        roteador.desligar();

        System.out.println("\n# Computador");
        pc.ligar();
        pc.conectarInternet();
        pc.desligar();
    }

}
