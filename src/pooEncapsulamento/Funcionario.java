package pooEncapsulamento;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    private int controleReajuste = 0;


    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibirInformacao() {
        System.out.printf("Nome: %s / Cargo: %s / Salário: %.2f",nome,cargo,salario);
    }


    public void exibirSalario () {
        System.out.println("Salário atual: " + salario);
    }

    public void ajustarSalario(double valor) {
        if (controleReajuste >= 1) {
            System.out.println("Não é possível reajustar o salário novamente!");
        } else {
            controleReajuste++;
            salario += salario * (valor / 100);
            System.out.printf("Novo salário: %.2f",salario);
        }
    }

}
