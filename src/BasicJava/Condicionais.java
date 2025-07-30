package BasicJava;

import java.util.Scanner;
public class Condicionais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 10;
        boolean verdade = true;
        if (numero >= 10 && verdade) {
            System.out.println("Entrou no if");
        } else {
            System.out.println("Entrou no else");
        }

        int opcao = 1;
        String mes = null;

        switch (opcao) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            default:
                System.out.println("Mês não encontrado.");
        }
        System.out.println(mes);

        System.out.print("Informe um numero de 1 ate 7: ");
        var option = input.nextInt();

        switch (option) {
            case 1:
            case 7:
                System.out.println("Fim de semana!");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção inválida");
        }

        var option2 = input.nextInt();
        switch(option2) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção inválida");
        }

        var mensagem = switch(option2) {
            case 1,7 -> {
                var day = option == 1 ? "Domingo" : "Sabado";
                yield String.format("Hoje é %s, fim de semana!",day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida";
        };
    }
}
