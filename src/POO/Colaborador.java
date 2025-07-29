package POO;

public class Colaborador {
    String nome;
    String cargo;
    int nivelAcesso;

    public void atualizarCadastro(String funcao, int nivel) {
        String mensagem = """
                ------ Antes da atualização ------
                Nome: %s
                Cargo: %s
                Nivel de acesso: %d
                """.formatted(nome,cargo,nivelAcesso);
        System.out.println(mensagem);
        String cargo = funcao;
        int nivelAcesso = nivel;
        String mensagemFinal = """
                ------ Depois da atualização ---------
                Nome: %s
                Cargo: %s
                Nivel de acesso: %d
                """.formatted(nome,cargo,nivelAcesso);
        System.out.println(mensagemFinal);

    }

    public void mostrarInformacao () {
        System.out.printf("Nome: %s %nCargo: %s %nNivel de acesso: %d",nome,cargo,nivelAcesso);
    }
}
