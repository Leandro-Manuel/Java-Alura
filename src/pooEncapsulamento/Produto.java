package pooEncapsulamento;

import java.sql.SQLOutput;

public class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if(preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
            System.out.println("\nPreço inválido. Definido a 0.0 por padrão.");
        }
    }

    public void info() {
        System.out.printf("Produto: %s %nPreço: %.2f",nome,preco);
    }
}
