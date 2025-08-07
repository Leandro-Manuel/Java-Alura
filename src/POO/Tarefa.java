package POO;

import java.util.ArrayList;

public class Tarefa {

    String titulo;
    String descricao;
    boolean concluida;

    public void exibirStatus() {
        String status = concluida ? "concluída" : "pendente";
        System.out.printf("\nTitulo: %s%nDescrição: %s - Status: %s",titulo,descricao,status);
    }
}
