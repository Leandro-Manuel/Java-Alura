import java.util.Scanner;
public class Atividade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String situacao;

        System.out.print("Informe a sua primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Informe a sua segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Informe a sua terceira nota: ");
        double nota3 = input.nextDouble();

        double mediaNotas = (nota1 + nota2 + nota3) / 3;

        if (mediaNotas < 5) {
            situacao = "reprovado";
        } else if (mediaNotas >= 5 && mediaNotas <= 6.9) {
            situacao = "em recuperacao";
        } else {
            situacao = "aprovado";
        }

        String mensagem = """
                A sua media foi %.1f
                sua situacao na materia: %s
                """.formatted(mediaNotas,situacao);
        System.out.println(mensagem);
    }
}
