package q3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente("Pedrita", 200);
        ContaBancaria conta2 = new ContaPoupanca("Bento", 450);

        System.out.println(conta1.sacar(20));
        System.out.println(conta1.depositar(1000));
        
        System.out.println(conta2.sacar(55));
        System.out.println(conta2.depositar(5000));

        System.out.println(conta1.sacar(20));
    }

}
