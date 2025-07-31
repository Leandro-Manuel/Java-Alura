package pooEncapsulamento;

public class Dispositivo {
    private String modelo;
    private int nivelBateria;


    public Dispositivo(String modelo) {
        this.modelo = modelo;
    }

    public void setNivelBateria(int nivel) {
        if(nivel >= 0 && nivel <= 100) {
            this.nivelBateria = nivel;
        } else System.out.println("Valor inválido, tente novamente.");
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void statusBateria() {
        if(nivelBateria >= 80) {
            System.out.println("Bateria cheia");
        } else if(nivelBateria > 20 && nivelBateria < 80) {
            System.out.println("Bateria ok");
        } else System.out.println("Bateria fraca");
    }
}
