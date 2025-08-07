package pooPolimorfismo;

public class Gerente extends Funcionario{

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
}
