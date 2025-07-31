package pooEncapsulamento;

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Leandro Manuel Francisco","Dev Back-End",3450.50);

        funcionario1.exibirSalario();
        funcionario1.ajustarSalario(15);
        funcionario1.exibirSalario();
    }
}
