package pooEncapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        boolean valido = valor <= this.saldo && valor > 0;
        if (valido) {
            this.saldo -= valor;
            System.out.println("--- Operação realizada com sucesso! ---");
            System.out.printf("Você sacou R$%.2f. Saldo atual: R$%.2f",valor,this.saldo);
        } else System.out.println("Saldo insuficiente para saque, tente novamente.");
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("--- Operação realizada com sucesso! ---");
            System.out.printf("Você depositou R$%.2f. Saldo atual: %.2f%n",valor,this.saldo);
        } else System.out.println("Valor incorreto, tente novamente!");
    }
}
