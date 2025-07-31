package pooEncapsulamento;

public class MainDispositivo {
    public static void main(String[] args) {
        Dispositivo d1 = new Dispositivo("POCO M3");
        d1.setNivelBateria(21);
        d1.statusBateria();
        System.out.println("nivel de bateria: " + d1.getNivelBateria());
    }
}
