package POO;
import java.util.ArrayList;
import java.util.List;


public class MainTarefa {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa();
        tarefa1.titulo = "Estudar Inglês";
        tarefa1.descricao = "Modal verbs, phrasal verbs get e present perfect";
        tarefa1.concluida = false;

        Tarefa tarefa2 = new Tarefa();
        tarefa2.titulo = "Estudar Java";
        tarefa2.descricao = "Revisar POO, abstração, encapsulamento, herança e polimorfismo";
        tarefa2.concluida = true;

        List<Tarefa> list = new ArrayList<>();
        list.add(tarefa1);
        list.add(tarefa2);

        for(Tarefa t : list) {
            t.exibirStatus();
        }
    }
}
