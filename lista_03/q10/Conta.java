package q10;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldoInicial) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("O número da conta não pode ser vazio.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        if (destino == null) {
            throw new IllegalArgumentException("A conta de destino não pode ser nula.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da transferência deve ser maior que zero.");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(
                String.format("Saldo insuficiente na conta %s. Saldo atual: R$ %.2f | Valor solicitado: R$ %.2f",
                              this.numero, this.saldo, valor)
            );
        }

        this.saldo -= valor;
        destino.saldo += valor;

        System.out.printf("Transferência de R$ %.2f realizada da conta %s para a conta %s.%n",
                          valor, this.numero, destino.numero);
    }
}