package ExerciciosPOO;

public class Revista extends Midia{
    private String edicao;
    public Revista(String titulo, int ano, String edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    @Override
    void exibirInfo() {
        gerarCodigo();
        System.out.printf("%nCódigo: %s - Revista: %s - Edição: %s",getCodigo(),super.titulo, edicao);
    }
}
