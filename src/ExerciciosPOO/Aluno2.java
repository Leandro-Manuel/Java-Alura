package ExerciciosPOO;

public class Aluno2 extends Pessoa{
    private double nota;

    public Aluno2(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    void exibirInformacoes() {
        System.out.printf("%nAluno: %s - Idade: %d - Nota: %.1f",super.nome,super.idade,nota);
    }
}
