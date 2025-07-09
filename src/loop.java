import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota;
        double acumuloNotas = 0;

        for (int x  = 1; x <= 4; x++) {
            System.out.print("Digite a sua nota: ");
            nota = input.nextDouble();

            acumuloNotas += nota;
        }

        double mediaFinal = acumuloNotas / 4;
        System.out.println("Sua final foi " + mediaFinal);


    }
}
