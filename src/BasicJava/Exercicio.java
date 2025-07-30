package BasicJava;

import java.util.Scanner;
class Exercicio {
    static String MENSAGEM_MENU = "Ola, bem-vindos!";
    public static void main(String[] args) {
        System.out.println(MENSAGEM_MENU);
        var input = new Scanner(System.in);

        System.out.print("Qual e o seu nome: ");
        String nome = input.nextLine();

        System.out.print("Qual e a sua idade: ");
        int idade = input.nextInt();

        boolean verificacao = idade >= 18;
        String mensagem = verificacao ?
                nome + ", voce pode dirigir" :
                nome + ", voce nao pode dirigir";

        System.out.print(mensagem);
        input.close();
    }
}
