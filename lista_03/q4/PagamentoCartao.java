package q4;

public class PagamentoCartao implements IPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f aprovado na modalidade CARTÃO DE CRÉDITO.%n", valor);
    }

}
