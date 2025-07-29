package POO;
public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Leandro";
        funcionario1.idade = 24;
        funcionario1.cargo = "Desenvolvedor";
        funcionario1.salario = 1518.20;
        funcionario1.exibirInformacao();
        funcionario1.ajustarSalario(10);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Manuel";
        funcionario2.idade = 45;
        funcionario2.cargo = "Quality Assurance";
        funcionario2.salario = 4520.85;
    }
}
