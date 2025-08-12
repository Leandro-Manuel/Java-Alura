package ExerciciosPOO;

public class ArCondicionado implements controlavel{
    private boolean ligado = false;

    @Override
    public void ligar() {
        if(ligado) {
            System.out.println("O ar-condicionado já está ligado.");
        } else {
            ligado = true;
            System.out.println("O ar-condicionado foi ligado.");
        }
    }
    @Override
    public void desligar() {
        if(ligado) {
            ligado = false;
            System.out.println("O ar-condicionado foi desligado.");
        } else System.out.println("O ar-condicionado já está desligado.");
    }

}
