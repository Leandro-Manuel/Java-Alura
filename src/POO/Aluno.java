package POO;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public void resultadoFinal() {
        double media = (nota1 + nota2) / 2;
        System.out.printf("Aluno: %s %nNotas: %.1f / %.1f %n",nome,nota1,nota2);
        if (media >= 7) {
            System.out.println("Situação: Aprovado!");
        } else System.out.println("Situação: Reprovado!");
    }
}
