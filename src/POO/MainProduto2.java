package POO;

public class MainProduto2 {
    public static void main(String[] args) {
        Produto2 produto = new Produto2();
        produto.nome = "Ventilador";
        produto.quantidadeTotal = 35;

        produto.comprar(10);
        produto.comprar(30);
    }
}
