package POO;

public class ContaBancaria {
    double saldo;

    public void encerrarConta() {
        saldo = 0.0;
        System.out.println("Sua conta foi encerrada!");
    }

    public void exibirSaldo() {
        System.out.printf("Seu saldo atual e R$%.2f",saldo);
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        } else System.out.println("O valor não pode ser negativo ou zero!");
    }
}
