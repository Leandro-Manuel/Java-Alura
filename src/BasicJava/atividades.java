package BasicJava;

import java.util.Scanner;
public class atividades {

    // fatorial de um numero
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = input.nextInt();
        int soma = numero * --numero;
        --numero;

        while(numero != 1 && numero != 0) {
            soma = soma * numero;
            --numero;
        }
        System.out.println("O fatorial do numero e: " + soma);

        // calculadora de um numero

        System.out.print("Digite um numero inteiro que deseja saber a tabuada: ");
        String mensagem;
        int numeroA = input.nextInt();
        int x = 1;

        if (numeroA > 1 && numeroA < 10) {
            while (x != 11) {
                System.out.println(numeroA + " x " + x + " = " + numeroA * x);
                x++;
            }
        } else {
            System.out.println("Não foi possivel realizar a operacao, tente novamente");
        }

    }
}
