package pooEncapsulamento;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Mouse",45.99);
        produto1.info();
        Produto produto2 = new Produto("Teclado",-15.99);
        produto2.info();
    }
}
