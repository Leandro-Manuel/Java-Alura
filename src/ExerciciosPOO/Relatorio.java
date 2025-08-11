package ExerciciosPOO;

public class Relatorio implements imprimivel{
    private String titulo;
    private String conteudo;
    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.printf("Título: %s%nConteúdo: %s",titulo,conteudo);
    }
}
