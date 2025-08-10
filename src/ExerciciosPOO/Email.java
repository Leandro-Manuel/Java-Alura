package ExerciciosPOO;

public class Email extends Notificacao{
    private String assunto;
    public Email(String assunto, String mensagem, String destinatario) {
        super(destinatario,mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.printf("%nEnviando E-mail para: %s%nAssunto: %s%nCorpo: %s",getDestinatario(), assunto, getMensagem());
    }
}
