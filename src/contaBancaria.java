import java.util.Scanner;
public class contaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeUsuario = "Leandro Manuel Francisco";
        double saldoAtual = 2500.00;
        String tipoConta = "conta corrente";
        String mensagemMenu;
        boolean condicao = true;

        String mensagemInicial = """
                Bem vindo ao Banco EasyBank
                -----------------------------------
                Dados do cliente:
                Nome: %s
                Tipo conta: %s
                Saldo inicial: %.2f
                """.formatted(nomeUsuario, tipoConta, saldoAtual);
        System.out.println(mensagemInicial);

        while (condicao) {
            mensagemMenu = """
                    Operacao bancaria
                    (1) - Consultar saldo
                    (2) - Depositar valor
                    (3) - Transferir valor
                    (4) - Sair do programa
                    """;
            System.out.print(mensagemMenu);
            System.out.print("Insira sua escolha: ");
            int opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Seu saldo atual e " + saldoAtual + " reais.");
                    break;
                case 2:
                    System.out.print("Insira o valor que deseja depositar: ");
                    double valor = input.nextDouble();
                    if (valor <= 0) {
                        System.out.println("Não e possivel depositar um valor igual a 0 ou negativo");
                    } else {
                        saldoAtual += valor;
                    }
                    break;
                case 3:
                    System.out.print("Insira o valor que deseja transferir: ");
                    valor = input.nextDouble();
                    if (valor <= 0) {
                        System.out.println("Não e possivel transfeir um valor igual a 0 ou negativo");
                    } else {
                        if (valor <= saldoAtual) {
                            saldoAtual -= valor;
                            System.out.println("Operacao realizada com sucesso, voce transferiu " + valor + " reais.");
                        } else {
                            System.out.println("saldo insuficiente, tente novamente");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    condicao = false;
                    break;
                default:
                    System.out.println("Insira um valor valido entre a opção");

            }
        }
    }
}
