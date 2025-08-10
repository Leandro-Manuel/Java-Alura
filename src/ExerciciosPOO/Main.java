package ExerciciosPOO;

public class Main {
    public static void main(String[] args) {
        Aluno alunoRegular = new Aluno("Leandro", "Regular");
        Bolsista alunoBolsista = new Bolsista("Manuel");
        alunoRegular.identificar();
        alunoBolsista.identificar();
    }
}
