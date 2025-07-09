import java.net.StandardSocketOptions;

public class PrimeiraClasse {
    public static <string> void main(String[] args) {
        String nome = "Leandro";
        System.out.print("Bem-vindo, " + nome + ".");
        System.out.println(" Tudo bem?");
        System.out.println("Concluí a primeira aula de java na alura!");

        String descricao = """
                Texto de descrição: ----
                Avaliação: -----
                Recomendação: -----
                """;
        System.out.println(descricao);

        int numero1 = 10;
        int numero2 = 20;

        int subtracao = numero2 - numero1;
        int soma = numero1 + numero2;
        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);

        double notaDoAluno = 8.5;
        System.out.println(notaDoAluno);

        boolean logado = true;
        if (logado) {
            System.out.println("Entrou nessa desgraça?");
        }

        String primeiroNome = "Leandro";
        String sobreNome = "Manuel";

        String nomeCompleto = "Olá, " + primeiroNome + " " + sobreNome + "." + " Tudo bem?";
        System.out.println(nomeCompleto);


        // se queremos comparar strings utilizamos equals(), pois não é possivel comparar string utilizando ==
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado!");
        }

        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String mensagem = """
                olá, %s. Seja muito bem-vindo ao menu!
                Damos as boas vindas a você.
                Sua idade: %d
                """.formatted(nome, idade);
        System.out.println(mensagem);

        double notaMedia = 7.5;
        System.out.println("Sua média final foi: " + notaMedia);
        int notaInteira = (int) notaMedia;
        System.out.println("Sua nota inteira: " + notaInteira);

        double notaAv1 = 7.5;
        double notaAv2 = 6.5;
        double mediaDasNotas = (notaAv1 + notaAv2) / 2;
        String mensagemResultado = """
                ---- Avaliação do Aluno ----
                Primeira nota: %.1f
                Segunda nota: %.1f
                Média final: %.1f
                """.formatted(notaAv1, notaAv2, mediaDasNotas);
        System.out.println(mensagemResultado);

    }
}
