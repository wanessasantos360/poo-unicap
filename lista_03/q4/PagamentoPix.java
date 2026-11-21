package q4;

public class PagamentoPix implements IPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado com sucesso na modalidade PIX.%n", valor);
    }

}
