package POO;

public class Estufa {
    String local;
    double temperatura;

    public void infoGeral() {
        System.out.printf("Sensor no local: %s %nTemperatura: %.1f",local,temperatura);
        if (temperatura > 37.5) {
            System.out.println("Alerta: temperatura acima do limite!");
        }
    }
}
