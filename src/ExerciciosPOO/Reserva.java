package ExerciciosPOO;

public class Reserva {

    public void reservar() {
        System.out.println("\nReserva realizada");
    }

    public void reservar(String data) {
        System.out.printf("\nReserva feita para a data %s",data);
    }

    public void reservar(String data, int pessoas) {
        System.out.printf("\nReserva feita para a data %s para %d pessoas.",data,pessoas);
    }
}
