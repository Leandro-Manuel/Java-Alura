package pooHeranca;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("leandro",3590);
        gerente.setBonus(150.99);
        System.out.println(gerente.getBonus());
        gerente.mostrarInformacao();
        gerente.reajustarSalario(10);

        Desenvolvedor dev1 = new Desenvolvedor("Manuel",4559.80,"Java / SpringBoot");
        dev1.mostrarInformacao();
        dev1.reajustarSalario(10);
    }
}
