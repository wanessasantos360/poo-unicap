package q3;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        double saldo = this.getSaldo();
        if(valor+2 < saldo){
            this.setSaldo(saldo-(valor+2));
            return valor;
        } else{
            System.err.println("Saldo insuficiente");
            return 0;
        }
    }


}
