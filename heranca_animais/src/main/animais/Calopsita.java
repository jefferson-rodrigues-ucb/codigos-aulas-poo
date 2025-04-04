package main.animais;

public class Calopsita extends Passaro implements Domestico {
    private String som;
    public Calopsita(String nome, String corPena, String som) {
        super(nome, corPena);
        this.som = som;
    }

    @Override
    public String fazerSom() {
        return this.som;
    }

    @Override
    public void voar() {
        System.out.println("Voa baixo");
    }

    @Override
    public void comer() {
        System.out.println("Semente de Girassol");
    }

    @Override
    public void dormir() {
        System.out.println("zzzZZZZ");
    }
}
