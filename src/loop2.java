import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 0;
        double soma = 0;
        double nota = 0;
        while (nota != -1) {
            System.out.print("Digite um número qualquer: ");
            nota = input.nextDouble();
            if (nota != -1) {
                soma += nota;
                qtd++;
            }
        }
        String mensagem = """
                A soma dos números foi %.2f
                A quantidade de números foi %d
                """.formatted(soma,qtd);
        System.out.println(mensagem);
    }
}
