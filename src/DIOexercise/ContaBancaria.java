package DIOexercise;

public class ContaBancaria {
    private String nome;

    private String senha;
    private double chequeEspecial;
    private double saldo;

    private boolean usouCheque = false;

    public ContaBancaria(String nome, String senha, double valorInicial) {
        this.nome = nome;
        this.senha = senha;
        this.saldo = valorInicial;
        if(valorInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = valorInicial * 0.5;
        }
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.printf("\nVocê depositou %.2f reais.",valor);
        } else System.out.println("Valor inválido, tente novamente.");
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            System.out.printf("%nVocê sacou %.2f reais.",valor);
        } else System.out.println("Não há saldo suficiente, tente novamente.");
    }

    public double getchequeEspecial() {
        return this.chequeEspecial;
    }

    public void usarChequeEspecial() {
        this.saldo += this.chequeEspecial;
        System.out.printf("Você está utilizando %.2f reais do cheque especial.",this.chequeEspecial);
        this.chequeEspecial = 0;
        usouCheque = true;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void usandoCheque() {
        if(usouCheque) {
            System.out.println("Você está usando o cheque especial!");
        } else System.out.println("Você não solicitou o cheque especial.");
    }

    public void pagarBoleto(double valor) {
        if (valor <= saldo && !usouCheque) {
            System.out.println("Boleto pago com sucesso!");
            this.saldo -= valor;
        } else if (valor <= saldo && usouCheque) {
            System.out.println("Boleto pago com sucesso!");
            System.out.printf("Você tem uma cobrança de 20% do cheque especial no valor de R$%.2f",saldo*0.2);
            this.saldo-= valor;
        } else {
            System.out.println("Saldo insuficiente, tente novamente");
        }
    }
}
