package main.animais;

public class Passaro extends Animal{

    private String corPena;

    public Passaro(String nome,  String corPena) {
        super(nome);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    @Override
    public String fazerSom() {
        return "Piu";
    }

    public void voar() {
        System.out.println("Voando");
    }
}
