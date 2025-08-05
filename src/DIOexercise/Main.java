package DIOexercise;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String inicial = """
                Bem vindo ao Banco iti!
                Para começarmos, vamos criar sua conta!
                Digite o seu nome completo:            
                """;
        String menu = """
                \n--- Escolha uma operação para começar ---
                1 - Consultar saldo
                2 - Consultar cheque especial 
                3 - Depositar dinheiro
                4 - Sacar dinheiro
                5 - Pagar um boleto
                6 - Verificar se a conta está usando cheque especial
                7 - usar cheque especial
                100 - para encerrar o programa
                """;
        System.out.println(inicial);
        String nome = scanner.nextLine();
        System.out.print("\nDigite a sua senha: ");
        String senha = scanner.nextLine();
        System.out.print("Digite o valor inicial da sua conta: ");
        double valor = scanner.nextDouble();
        ContaBancaria conta1 = new ContaBancaria(nome,senha,valor);

        boolean continuar = true;

        while(continuar) {
            System.out.println(menu);
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.printf("Você tem R$%.2f",conta1.getSaldo());
                    break;
                case 2:
                    System.out.printf("Você tem R$%.2f",conta1.getchequeEspecial());
                    break;
                case 3:
                    System.out.printf("\nInsira o valor que deseja depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.printf("\nInsira o valor que deseja sacar: ");
                    double valorSacar = scanner.nextDouble();
                    conta1.sacar(valorSacar);
                    break;
                case 5:
                    System.out.printf("\nInsira o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();
                    conta1.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    conta1.usandoCheque();
                    break;
                case 7:
                    conta1.usarChequeEspecial();
                    break;
                case 100:
                    System.out.print("Você tem certeza que quer encerrar o programa? ");
                    continuar = scanner.nextBoolean();

                    if(!continuar) {
                        continue;
                    } else {
                        continuar = false;
                        break;
                    }
                default:
                    System.out.println("Valor inválido, tente novamente.");
            }
        }
    }
}
