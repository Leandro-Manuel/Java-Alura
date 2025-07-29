package POO;

public class Funcionario {
    String nome;
    int idade;
    String cargo;
    double salario;

    public void exibirInformacao() {
        System.out.printf("Nome: %s / idade: %d / cargo: %s / salario: %.2f",nome,idade,cargo,salario);
    }

    public void ajustarSalario (double porcentagem) {
        salario += (salario * (porcentagem / 100));
        System.out.println("Salario atual: " + salario);
    }
}
