package pooEncapsulamento;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Gol turbo","PFTS-8028",2010);
        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Ano: " + carro1.getAno());

    }
}
