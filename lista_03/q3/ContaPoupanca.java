package q3;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        double saldo = this.getSaldo();
        if(valor < saldo){
            this.setSaldo(saldo-(valor));
            return valor;
        } else{
            System.err.println("Saldo insuficiente");
            return 0;
        }
    }


}
