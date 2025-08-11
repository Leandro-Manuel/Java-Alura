package ExerciciosPOO;

public class BoletoBancario extends Pagamento{
    private double taxaTotal;
    public BoletoBancario(double valor) {
        super(valor);
        taxaTotal = valor * 0.01;
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("%nBoleto de R$%.2f gerado com sucesso. (Taxa: R$%.2f)",this.valor, taxaTotal);
    }
}
