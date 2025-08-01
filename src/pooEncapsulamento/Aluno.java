package pooEncapsulamento;

public class Aluno {
    private String nome;

    private int pontos;

    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    public void ganharPontos(int pontos) {
        if(pontos > 0) {
            this.pontos += pontos;
        }
        atualizarNivel();
    }

    private void atualizarNivel() {
        this.nivel = (pontos / 100) + 1;
    }

    public void exibirStatus() {
        System.out.printf("Nome: %s %nPontos: %d %nNível: %d",nome,pontos,nivel);
    }
}
