package pooAbstrataInterface;

public class Desenvolvedor extends Funcionario{

    private String stack;
    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome,salario);
        this.stack = stack;
    }

    @Override
    public void mostrarInformacao() {
        System.out.printf("\nDesenvolvedor: %s - Salário: R$%.2f - stack: %s",super.nome,super.salario,stack);
    }
}
