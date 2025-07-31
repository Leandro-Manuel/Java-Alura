package pooEncapsulamento;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;


    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirSalario () {
        System.out.println("Salário atual: " + salario);
    }

    public void ajustarSalario(double valor) {
        salario += salario * (valor / 100);
        System.out.printf("Novo salário: %.2f",salario);
    }

}
