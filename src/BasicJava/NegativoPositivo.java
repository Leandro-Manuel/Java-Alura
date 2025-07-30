package BasicJava;

import java.util.Scanner;

public class NegativoPositivo {

    // crie um programa que solicite ao usuario uma sequencia de numeros e verifique se é positivo ou negativo
    // permita que o usuario encerre o programa quando digitar 'fim', logo apos conte quantos numeros sao positivo ou
    // negativos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        while (true) {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

        scanner.close();
    }
}
