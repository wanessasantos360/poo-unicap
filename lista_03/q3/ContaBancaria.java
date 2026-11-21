package q3;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    // método concreto que adiciona um valor ao saldo
    public String depositar(double valor){
        return "Depositado: R$ "+ valor + "\nNovo Saldo: R$" + (this.saldo += valor);
    }
    
    //sacar(double valor): método abstrato.
    public abstract double sacar(double valor);

}
