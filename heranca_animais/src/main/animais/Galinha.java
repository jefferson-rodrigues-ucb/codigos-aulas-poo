package main.animais;

public class Galinha extends Passaro implements Domestico {

    public Galinha(String nome, String corPena) {
        super(nome, corPena);
    }

    @Override
    public String fazerSom() {
        return "Có Có";
    }

    @Override
    public void voar() {
        System.out.println("Plana");
    }

    @Override
    public void comer() {
        System.out.println("Comendo milho");
    }

    @Override
    public void dormir() {
        System.out.println("zzzZZZZ");
    }
}
