package pooAbstrataInterface;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void mostrarInformacao() {
        System.out.printf("Nome do funcionario: %s %nSalário: %.2f",nome,salario);
    }

    public void reajustarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);
        System.out.printf("%nNovo salário de %s é: R$%.2f",nome,salario);
    }

    public void reajustarSalario() {
        salario += 350;
        System.out.printf("%nNovo salário de %s com bonus: R$%.2f",nome,salario);
    }
}
