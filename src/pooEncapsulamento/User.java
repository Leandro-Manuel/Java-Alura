package pooEncapsulamento;

public class User {
    private final String login;
    private String senha;

    public User(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    public void alterarSenha(String senhaAntiga, String NovaSenha) {
        if(senhaAntiga.equals(this.senha)) {
            this.senha = NovaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else System.out.println("Senha incorreta, tente novamente.");
    }


}
