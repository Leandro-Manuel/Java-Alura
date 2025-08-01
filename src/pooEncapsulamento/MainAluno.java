package pooEncapsulamento;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leandro");
        aluno1.ganharPontos(300);
        aluno1.exibirStatus();
    }
}
