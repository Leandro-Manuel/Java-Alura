package POO;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.saldo = 1500.00;
        conta1.encerrarConta();
        conta1.exibirSaldo();
        conta1.depositar(15.85);
        conta1.exibirSaldo();
    }
}
