package ExerciciosPOO;

public class Luz implements controlavel{
    private boolean ligado = false;
    @Override
    public void ligar() {
        if(ligado) {
            System.out.println("A luz já está ligada.");
        } else {
            ligado = true;
            System.out.println("A luz foi ligada.");
        }
    }
    @Override
    public void desligar() {
        if(ligado) {
            ligado = false;
            System.out.println("A luz foi desligada.");
        } else System.out.println("A luz já está desligada.");
    }
}
