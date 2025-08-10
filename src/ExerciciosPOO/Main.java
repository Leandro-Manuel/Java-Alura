package ExerciciosPOO;

public class Main {
    public static void main(String[] args) {
        Aluno alunoRegular = new Aluno("Leandro", "Regular");
        Bolsista alunoBolsista = new Bolsista("Manuel");
        alunoRegular.identificar();
        alunoBolsista.identificar();


        Aluno2 aluno1 = new Aluno2("Francisco",18,7.5);
        Aluno2 aluno2 = new Aluno2("Pluto",22,8.5);

        Docente professora = new Docente("Aeda",36,"Fundamentos de programação");
        Docente professor = new Docente("Wellington",60,"Programação Back-End");

        aluno1.exibirInformacoes();
        professora.exibirInformacoes();


        Livro livro = new Livro("Legend",2018,"Marie Lu");
        Revista revista = new Revista("SBT new",2016,"345");
        Ebook eBook = new Ebook("Inglês Intermediário", 2010,"PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        eBook.exibirInfo();

        Email email = new Email("Qual feature iremos usar","Olá, leandro. gostaria de saber qual feature iremos usar no projeto","123@hotmail.com");
        email.enviar();
        SMS sms = new SMS("(81)98600-5634","Mandar curriculo para o e-mail");
        sms.enviar();
        Push push = new Push("Java básico","hoje eu aprendi POO","main.app");
        push.enviar();
    }
}
