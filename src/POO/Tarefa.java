package POO;

public class Tarefa {
    String descricao;
    boolean concluida;

    public void exibirStatus() {
        String status;
        if (concluida) {
            status = "Concluída";
        } else status = "pendente";
        System.out.printf("\nTarefa: %s - Status: %s",descricao,status);
    }
}
