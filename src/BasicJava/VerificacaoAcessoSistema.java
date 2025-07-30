package BasicJava;

import java.util.Scanner;
public class VerificacaoAcessoSistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o codigo de acesso: ");
        int codigo = input.nextInt();

        System.out.print("Digite o nivel de permissao: ");
        int permissao = input.nextInt();

        boolean acesso1 = codigo == 2023;
        boolean permissao1 = permissao >= 1 && permissao <= 3;

        if (acesso1 && permissao1) {
            System.out.println("Acesso autorizado");
        } else {
            if (!acesso1 && !permissao1) {
                System.out.println("codigo de acesso e nivel de permissao incorretos");
            } else {
                if (!acesso1) {
                    System.out.println("codigo de acesso negado");
                } else if (!permissao1) {
                    System.out.println("nivel de permissao negado");
                }
            }
            input.close();
        }
    }
}
