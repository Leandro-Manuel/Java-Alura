package POO;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void relatorio() {
        System.out.printf("Nome do produto: %s \nPreço: R$%.2f  \nQuantidade de estoque: %d",nome,preco,quantidade);
    }
}
