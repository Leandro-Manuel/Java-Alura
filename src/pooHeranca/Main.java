package pooHeranca;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Leandra",9500);
        gerente1.setBonus(150.99);
        gerente1.mostrarInformacao();
        gerente1.reajustarSalario(1253.95);
        gerente1.mostrarInformacao();

        Desenvolvedor dev1 = new Desenvolvedor("Leandro",4559.80,"Java / SpringBoot");
        dev1.mostrarInformacao();
        dev1.reajustarSalario(10);
    }
}
