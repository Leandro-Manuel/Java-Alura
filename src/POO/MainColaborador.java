package POO;

public class MainColaborador {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador();
        colaborador1.nome = "Leandro Manuel Francisco";
        colaborador1.cargo = "Analista de segurança da informação junior";
        colaborador1.nivelAcesso = 2;

        colaborador1.atualizarCadastro("Analista de segurança da informação pleno",3);



    }
}
