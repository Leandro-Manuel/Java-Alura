package POO;

public class MainEstufa {
    public static void main(String[] args) {
        Estufa estufa1 = new Estufa();
        estufa1.local = "Setor A bloco 2";
        estufa1.temperatura = 23.5;

        estufa1.infoGeral();

        Estufa estufa2 = new Estufa();
        estufa2.local = "Setor B bloco 1";
        estufa2.temperatura = 40.5;

        estufa2.infoGeral();
    }
}
