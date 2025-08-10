package ExerciciosPOO;

public abstract class Notificacao {
    private String destinatario;
    private String mensagem;

    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void enviar() {
        System.out.println("Mensagem enviada com sucesso!");
    }
}
