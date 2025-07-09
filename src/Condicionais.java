public class Condicionais {
    public static void main(String[] args) {
        int numero = 10;
        boolean verdade = true;
        if (numero >= 10 && verdade) {
            System.out.println("Entrou no if");
        } else {
            System.out.println("Entrou no else");
        }

        int opcao = 1;
        String mes = null;

        switch (opcao) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            default:
                System.out.println("Mês não encontrado.");
        }
        System.out.println(mes);
    }
}
