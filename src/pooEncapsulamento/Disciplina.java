package pooEncapsulamento;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();

    private int ignoradas = 0;
    private int registradas = 0;

    public Disciplina(String materia) {
        this.nome = materia;
    }

    public void adicionarNota(double nota) {
        if(nota > 0 && nota <= 10) {
            registradas++;
            notas.add(nota);
        } else {
            ignoradas++;
            System.out.println("Nota inválida ignorada: " + nota);
        }
    }

    double media = 0;
    private double calcularMedia() {
        for(double nota : notas) {
            media += nota;
        }
        return media / notas.size();
    }

    public void status() {
        System.out.printf("Total de notas válidas: %d %nTotal de notas inválidas: %d %n Média em %s: %.1f",registradas,ignoradas,nome,calcularMedia());
    }


}
