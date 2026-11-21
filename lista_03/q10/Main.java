package q10;

public class Main {
    public static void main(String[] args) {
        Conta contaOrigem = new Conta("1001-5", 500.00);
        Conta contaDestino = new Conta("2002-9", 150.00);

        System.out.printf("Saldos iniciais -> Origem (%s): R$ %.2f | Destino (%s): R$ %.2f%n%n",
                          contaOrigem.getNumero(), contaOrigem.getSaldo(),
                          contaDestino.getNumero(), contaDestino.getSaldo());

        // 1. Transferência válida
        try {
            contaOrigem.transferir(contaDestino, 200.00);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.err.println("Erro na transferência 1: " + e.getMessage());
        }

        // 2. Transferência inválida: saldo insuficiente
        try {
            contaOrigem.transferir(contaDestino, 400.00);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.err.println("Erro na transferência 2: " + e.getMessage());
        }

        // 3. Transferência inválida: valor zero ou negativo
        try {
            contaOrigem.transferir(contaDestino, -50.00);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.err.println("Erro na transferência 3: " + e.getMessage());
        }

        // 4. Transferência inválida: conta de destino nula
        try {
            contaOrigem.transferir(null, 50.00);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.err.println("Erro na transferência 4: " + e.getMessage());
        }

        System.out.printf("%nSaldos finais -> Origem (%s): R$ %.2f | Destino (%s): R$ %.2f%n",
                          contaOrigem.getNumero(), contaOrigem.getSaldo(),
                          contaDestino.getNumero(), contaDestino.getSaldo());
    }
}