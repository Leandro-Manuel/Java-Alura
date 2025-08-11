package ExerciciosPOO;

public class CartaoCredito extends Pagamento{
    private double taxaTotal;

    public CartaoCredito(double valor) {
        super(valor);
        taxaTotal = valor * 0.03;
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("%nPagamento de R$ %.2f confirmado no cartão de crédito. (Taxa: R$ %.2f)",this.valor,taxaTotal);
    }
}
