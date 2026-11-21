package q4;

public class Main {
    public static void main(String[] args) {
        // Vetor do Pagamento
        IPagamento[] formasPagamento = new IPagamento[3];

        formasPagamento[0] = new PagamentoPix();
        formasPagamento[1] = new PagamentoCartao();
        formasPagamento[2] = new PagamentoBoleto();
        // Valores de exemplo 
        double[] valores = {120.50, 350.00, 89.90};

        // Percorrendo o vetor e executando o método polimorficamente
        for (int i = 0; i < formasPagamento.length; i++) {
            formasPagamento[i].processarPagamento(valores[i]);
        }
    }

}
