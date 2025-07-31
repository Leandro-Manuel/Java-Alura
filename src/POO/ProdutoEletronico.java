package POO;
import java.util.ArrayList;
import java.util.List;
public class ProdutoEletronico {
    String nome;
    double preco;
    int quantidade;

    public double precoTotal () {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        ProdutoEletronico produto1 = new ProdutoEletronico();
        produto1.nome = "Tablet";
        produto1.preco = 1255.85;
        produto1.quantidade = 3;

        ProdutoEletronico produto2 = new ProdutoEletronico();
        produto2.nome = "Notebook Acer";
        produto2.preco = 3450.99;
        produto2.quantidade = 2;

        List<ProdutoEletronico> lista = new ArrayList<>();
        lista.add(produto1);
        lista.add(produto2);

        double Total = 0.0;
        for(ProdutoEletronico produto : lista) {
            Total += produto.precoTotal();
        }
        System.out.printf("Preço total do carrinho: R$%.2f",Total);

    }
}
