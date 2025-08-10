package ExerciciosPOO;

public abstract class Midia {
    protected String titulo;
    protected int anoPublicacao;

    private String codigo = "LIB-";

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.anoPublicacao = ano;
    }

    protected void gerarCodigo() {
        codigo += titulo.substring(0,2);
        codigo += String.valueOf(anoPublicacao);
    }

    protected String getCodigo() {
        return this.codigo;
    }

    abstract void exibirInfo();
}
