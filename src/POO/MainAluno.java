package POO;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Leandro";
        aluno1.nota1 = 4.5;
        aluno1.nota2 = 5.5;
        aluno1.resultadoFinal();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Manuel";
        aluno2.nota1 = 6.5;
        aluno2.nota2 = 8.0;
        aluno2.resultadoFinal();
    }
}
