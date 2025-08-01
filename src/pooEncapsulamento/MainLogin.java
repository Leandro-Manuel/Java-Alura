package pooEncapsulamento;
import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o seu login: ");
        String login = scanner.nextLine();
        System.out.print("Digite a sua senha: ");
        String senha = scanner.nextLine();
        Login user1 = new Login(login,senha);
        System.out.println("Conta criada com sucesso! Agora realize o login no sistema.");

        int tentativas = 3;
        while(tentativas > 0) {

            System.out.print("Digite o seu login: ");
            String login2 = scanner.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha2 = scanner.nextLine();

            if(user1.validarSenha(login2,senha2)) {
                System.out.println("Login efetuado com sucesso!");
                break;
            } else {
                --tentativas;
                if (tentativas == 0) {
                    System.out.println("Acesso bloqueado por senha incorreta.");
                } else System.out.printf("Login e/ou senha incorreto(s). Tente novamente, tentativas restatantes: %d%n",tentativas);
            }

        }
        scanner.close();
    }
}
