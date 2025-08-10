package pooAbstrataInterface;

public class Gerente extends Funcionario implements Aprovador{

    private double bonus;
    public Gerente(String nome, double salario) {
        super(nome,salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void mostrarInformacao() {
        System.out.printf("Gerente: %s - Salário: R$%.2f - bonus: %.2f",super.nome,super.salario,bonus);
    }

    @Override
    public void calcularPLR() {
        System.out.println("PLR do desenvolvedor");
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("Gerente: %s aprovou o projeto '%s'",super.nome,nomeProjeto);
    }
}
