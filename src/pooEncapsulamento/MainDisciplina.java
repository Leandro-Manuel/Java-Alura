package pooEncapsulamento;

public class MainDisciplina {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(8.5);
        matematica.adicionarNota(5.5);
        matematica.adicionarNota(6.5);
        matematica.adicionarNota(-3.5);
        matematica.adicionarNota(3.0);

        matematica.status();
    }
}
