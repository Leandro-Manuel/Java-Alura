package pooEncapsulamento;
import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Integer> avaliacoes = new ArrayList<>();


    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public void avaliar(int avaliacao) {
        if (avaliacao > 0 && avaliacao < 6) {
            avaliacoes.add(avaliacao);
        } else System.out.println("Valor inválido, tente novamente.");
    }

    int soma = 0;
    public double mediaAvaliacao() {
        for (int nota : avaliacoes) {
            soma+= nota;
        }
        return (double) soma / avaliacoes.size();
    }
}
