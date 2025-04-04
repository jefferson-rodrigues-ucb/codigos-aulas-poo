package main.animais;

public class Pardal extends Passaro {
    public Pardal(String nome) {
        super(nome, "Marrom");
    }

    @Override
    public String fazerSom() {
        return "chirip";
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }
}
