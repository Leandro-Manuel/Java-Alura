package BasicJava;

import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota;
        double acumuloNotas = 0;

        for (int x  = 1; x <= 4; x++) {
            System.out.print("Digite a sua nota: ");
            nota = input.nextDouble();

            acumuloNotas += nota;
        }

        double mediaFinal = acumuloNotas / 4;
        System.out.println("Sua final foi " + mediaFinal);

        int numero = 10;
        while (numero < 15) {
            System.out.println("Estou no BasicJava.loop while");
            numero++;
        }

        int numero2 = 10;
        do {
            System.out.println("Estou no BasicJava.loop do while");
            numero2++;
        } while(numero2 < 15);

         // for-each e como se fosse o laco for aprimorado, usamos para percorrer array e colecoes
        //como nao utilizamos indice, o codigo fica mais limpo, e recomendavel quando precisamos apenas
        //dos valores, a cada iteracao a variavel nome vai representar o elemento do array nome

        String[] nomes = {"Leo", "Manu", "Fran"};

        for (String nome : nomes) {
            if (nome.equals("Fran")) {
                System.out.println("Achei o Fran");
            } else {
                System.out.println("Não é o Fran");
            }
        }
    }
}
