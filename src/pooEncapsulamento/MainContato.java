package pooEncapsulamento;
import java.util.ArrayList;
public class MainContato {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Leandro Manuel Francisco","(81)986005634"));
        contatos.add(new Contato("Manuel Francisco Leandro","(21)988667621"));
        contatos.add(new Contato("Francisco Manuel Leandro", "(65)99875621"));

        int indice = 1;
        for (Contato contato : contatos) {
            System.out.printf("%n%d - %s %s",indice,contato.getNome(),contato.getTelefone());
            indice++;
        }
    }
}
