package pooEncapsulamento;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Leandro Manuel Francisco",100);
        System.out.println("Saldo atual: " + conta1.getSaldo());
        conta1.depositar(55.99);
        conta1.sacar(0);
    }
}
