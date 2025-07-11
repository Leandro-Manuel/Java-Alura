import java.util.Scanner;
public class CriandoMetodos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a sua segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a sua terceira nota: ");
        double nota3 = input.nextDouble();

        System.out.print("Digite a sua quarta nota: ");
        double nota4 = input.nextDouble();

        double notaFinal = mediaNotas(nota1,nota2,nota3,nota4);

        String mensagem = """
                A sua media final foi %.2f
                """.formatted(notaFinal);
        System.out.println(mensagem);
        input.close();
    }
    public static double mediaNotas(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
    }
}
