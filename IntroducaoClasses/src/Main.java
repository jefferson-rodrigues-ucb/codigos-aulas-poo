import Bichos.Gato;

public class Main {
    public static void main(String[] args) {
        Gato chico = new Gato("cinza", "Chiquinho", "vira-lata");
        Gato gato_rua = new Gato("cinza", "Bichano", "vira-lata");
        Gato gato_joao = new Gato("preto e branco", "Frajola", "Persa");

        System.out.println("Nome do gato do Jefferson: " +  chico.getNome());

        System.out.println("Cor do pelo do gato de rua: " +  gato_rua.getPelo());
        gato_rua.setPelo("Azul");
        System.out.println("Cor do pelo do gato de rua: " +  gato_rua.getPelo());

        System.out.println("Gato do João: ");
        gato_joao.dormir();
    }
}