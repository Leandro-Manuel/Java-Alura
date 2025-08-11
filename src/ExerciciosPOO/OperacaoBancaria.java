package ExerciciosPOO;

public abstract class OperacaoBancaria implements acaoBancaria{

    private double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }
    @Override
    public void executar() {};

    public double getValor() {
        return valor;
    }
}
