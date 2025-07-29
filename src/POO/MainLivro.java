package POO;

public class MainLivro {
    public static void main(String[] args) {
        Livro obra1 = new Livro();
        obra1.titulo = "Legend";
        obra1.autor = "Marie Lu";
        obra1.paginas = 310;

        obra1.exibirResumo();
    }
}
