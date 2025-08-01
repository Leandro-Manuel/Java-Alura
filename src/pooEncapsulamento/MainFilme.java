package pooEncapsulamento;

public class MainFilme {
    public static void main(String[] args) {
        Filme terror1 = new Filme("O grito");
        terror1.avaliar(5);
        terror1.avaliar(3);
        terror1.avaliar(1);
        terror1.avaliar(2);
        terror1.avaliar(4);
        System.out.println("A media da avaliação do filme: " + terror1.mediaAvaliacao());
    }
}
