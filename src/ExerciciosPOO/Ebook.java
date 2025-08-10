package ExerciciosPOO;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int ano, String formato) {
        super(titulo,ano);
        this.formato = formato;
    }
    @Override
    void exibirInfo() {
        gerarCodigo();
        System.out.printf("%nCódigo: %s - E-book: %s - Formato: %s",getCodigo(),super.titulo, formato);
    }
}
