package POO;

public class MainLivroDevolucao {
    public static void main(String[] args) {
        LivroDevolucao livro = new LivroDevolucao();
        livro.titulo = "Legend";
        livro.diasAtraso = 3;
        livro.calcularMulta();
        livro.exibirDetalhes();
    }
}
