package pooPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Mario", 1518);
        ((Gerente) gerente).setBonus(100);
        gerente.mostrarInformacao();
        gerente.reajustarSalario(1);

        Funcionario desenvolvedor = new Desenvolvedor("Fernanda",1518,"Python");
        desenvolvedor.mostrarInformacao();
        desenvolvedor.reajustarSalario();

    }
}
