package q4;

public class PagamentoBoleto implements IPagamento{

    @Override
    public void processarPagamento(double valor) {
        // TODO Auto-generated method stub
        System.out.printf("Boleto gerado no valor de R$ %.2f na modalidade BOLETO BANCÁRIO.%n", valor);
    }

}
