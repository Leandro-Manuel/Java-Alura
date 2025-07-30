package POO;

public class Produto2 {
    String nome;
    int quantidadeTotal;

    public void comprar(int quantidade) {
        if (quantidade <= quantidadeTotal) {
            quantidadeTotal -= quantidade;
            System.out.printf("Compra realizado com sucesso!\nvoce adquiriu %d quantidades do produto. \nEstoque " +
                    "restante: %d",quantidade,quantidadeTotal);
        } else System.out.println("\nEstoque insuficiente");
    }
}
