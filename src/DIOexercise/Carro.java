package DIOexercise;


public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private final String placa;

    private int velocidadeKm;
    private boolean ligado;

    private int marcha;

    public Carro(String marca,String modelo,int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;

        velocidadeKm = 0;
        ligado = false;
        marcha = 0;
    }

    public void ligarCarro() {
        if(ligado) {
            System.out.println("O carro já está ligado");
        } else {
            ligado = true;
            System.out.println("O carro foi ligado");
        }
    }

    public void desligarCarro() {
        if(ligado) {
            if(velocidadeKm == 0 && marcha == 0) {
                System.out.println("O carro foi desligado");
                ligado = false;
            } else System.out.println("O carro deve estar parado e na marcha zero");
        } else {
            System.out.println("O carro já está desligado");
        }
    }

    public void acelerar() {
        if(ligado) {
            if(marcha > 0 && velocidadeKm <= 120) {
                if (velocidadeKm < 20) {
                    velocidadeKm += 1;
                    System.out.printf("\nVocê está a %d km/h",velocidadeKm);
                } else System.out.printf("\nVocê está a %d km/h, troque para a segunda marcha",velocidadeKm);
            } else System.out.println("O carro está na marcha 0, troque de marca primeiro ou você está na velocidade limite");

        } else System.out.println("O carro está desligado");
    }

    public void diminuirVelocidade() {
        if(ligado) {
            if(marcha > 0) {
                velocidadeKm -= 1;
                System.out.printf("Você está a %d km/h",velocidadeKm);
            } else System.out.println("O carro está na marcha 0, troque de marca primeiro");

        } else System.out.println("O carro está desligado");
    }

    public void verificarVelocidade() {
        System.out.printf("\nVocê está a %d km/h",velocidadeKm);
    }

    public void virarDireita() {
        if(ligado) {
            if(velocidadeKm > 0 && velocidadeKm <= 40) {
                System.out.println("virando à direita...");
            } else System.out.println("Não é possível virar à direita, velocidade não permitida");
        } else System.out.println("Você deve ligar o carro primeiro");
    }

    public void virarEsquerda() {
        if(ligado) {
            if(velocidadeKm > 0 && velocidadeKm <= 40) {
                System.out.println("virando à esquerda...");
            } else System.out.println("Não é possível virar à esquerda, velocidade não permitida");
        } else System.out.println("Você deve ligar o carro primeiro");
    }

    public void trocarMarcha() {
        if(ligado) {
            switch(marcha) {
                case 0 -> {
                    this.marcha = 1;
                    System.out.println("Você está na 1 marcha");
                }
                case 1 -> this.marcha = 2;
                case 2 -> this.marcha = 3;
                case 3 -> this.marcha = 4;
                case 4 -> this.marcha = 5;
                case 5 -> this.marcha = 6;
            }
        } else System.out.println("O carro está desligado, ligue-o primeiro");
    }

}
