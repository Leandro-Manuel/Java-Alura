package ExerciciosPOO;

public class Notification {

    public void enviarMensagem(String mensagem) {
        System.out.printf("%nMensagem enviada para todos: %s",mensagem);
    }

    public void enviarMensagem(String nome, String mensagem) {
        System.out.printf("%nMensagem para %s: %s",nome,mensagem);
    }

    public void enviarMensagem(String nome, String mensagem, int vezes) {
        for(int x = 1; x <= vezes; x++) {
            System.out.printf("%nMensagem para %s: %s",nome,mensagem);
        }
    }
}
