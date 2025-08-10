package ExerciciosPOO;

public class Docente extends Pessoa{
    private String materia;
    public Docente(String nome, int idade, String materia) {
        super(nome,idade);
        this.materia = materia;
    }

    @Override
    void exibirInformacoes() {
        System.out.printf("%nDocente: %s - Idade: %d - Materia: %s",super.nome,super.idade,materia);
    }
}
