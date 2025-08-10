package ExerciciosPOO;

public class Push extends Notificacao{
    private String titulo;
    public Push(String titulo, String mensagem, String destinatario) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.printf("%nEnviando Push para: %s%nTítulo: %s%nConteúdo: %s",getDestinatario(),titulo,getMensagem());
    }
}
