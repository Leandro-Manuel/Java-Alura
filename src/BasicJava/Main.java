package BasicJava;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int idade = 19;
        int idade2 = 20;
        System.out.println("Hello world!");
        System.out.println(++idade + idade2);

        /*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo
          exiba "Número positivo", caso contrário, exiba "Número negativo".*/

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("O numero e positivo");
        } else if (numero < 0) {
            System.out.println("O numero e negativo");
        } else {
            System.out.println("O numero e igual a 0");
        }
    }
}