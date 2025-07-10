import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class desafio {

    /* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir
    para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se
    o número digitado pelo usuário é maior ou menor do que o número gerado.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdChances = 5;
        int numeroAleatorio = new Random().nextInt(100);
        int numero;

        String mensagem = """
                Bem vindo ao jogo da adivinhacao!
                Voce tem 5 chances para adivinhar o numero de 0 a 99
                """;
        System.out.println(mensagem);

        for (int i = 5; i >= 1; i--) {

            System.out.print("Digite o numero: ");
            numero = input.nextInt();

            if (numero != numeroAleatorio) {
                if (numero > numeroAleatorio) {
                    System.out.println("O numero que voce digitou e maior do que o numero sorteado");
                } else {
                    System.out.println("O numero que voce digitou e menor do que o numero sorteado");
                }
                System.out.println("Você tem " + --qtdChances + " chances restantes");
            } else {
                break;
            }
        }

        mensagem = """
                Parabéns! Você adivinhou o numero: %d
                voce acabou com %d chances restantes
                """.formatted(numeroAleatorio,qtdChances);
        System.out.println(mensagem);
    }
}
