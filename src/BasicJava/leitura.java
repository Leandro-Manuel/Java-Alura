package BasicJava;

import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = input.nextLine();

        System.out.print("Informe a sua idade: ");
        int idade = input.nextInt();

        System.out.println("O seu nome é " + nome);
        System.out.println("A sua idade é " + idade);

        System.out.println("Digite sua primeira nota");
        double nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota");
        double nota2 = input.nextDouble();

        double mediaFinal = (nota1 + nota2) / 2;
        System.out.println("Sua média final foi " + mediaFinal);

        input.close();
    }
}
