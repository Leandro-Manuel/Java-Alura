package ExerciciosPOO;

public class Pix extends Pagamento{
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("%nPagamento via Pix de R$%.2f confirmado.",this.valor);
    }
}
