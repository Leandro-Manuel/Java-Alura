package POO;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Arroz integral";
        produto1.preco = 15.85;
        produto1.quantidade = 267;

        produto1.relatorio();
    }
}
