package ExerciciosPOO;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    @Override
    void exibirInfo() {
        gerarCodigo();
        System.out.printf("%nCódigo: %s - Livro: %s - Autor: %s",getCodigo(),super.titulo, autor);
    }
}
