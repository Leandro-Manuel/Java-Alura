package POO;

public class LivroDevolucao {
    String titulo;
    int diasAtraso;

    public double calcularMulta() {
        return diasAtraso * 2.50;
    }

    public void exibirDetalhes() {
        double valorTotal = calcularMulta();
        System.out.printf("Livro: %s %nMulta por %d dias de atraso: R$%.2f",titulo,diasAtraso,valorTotal);
    }
}
