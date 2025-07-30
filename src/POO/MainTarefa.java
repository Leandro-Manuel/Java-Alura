package POO;
import java.util.ArrayList;
import java.util.List;


public class MainTarefa {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa();
        tarefa1.descricao = "Lavar os pratos";
        tarefa1.concluida = false;

        Tarefa tarefa2 = new Tarefa();
        tarefa2.descricao = "Estudar inglês";
        tarefa2.concluida = true;

        List<Tarefa> list = new ArrayList<>();
        list.add(tarefa1);
        list.add(tarefa2);

        for(Tarefa t : list) {
            t.exibirStatus();
        }
    }
}
