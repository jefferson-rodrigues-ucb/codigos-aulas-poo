package Bichos;

public class Gato {
    private String pelo;
    private String nome;
    private String raca;

    public Gato(String pelo, String nome, String raca) {
        this.pelo = pelo;
        this.nome = nome;
        this.raca = raca;
    }
    public String getPelo() {
        return pelo;
    }
    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void dormir() {
        System.out.println("zzzzZZZZZ");
    }
}
