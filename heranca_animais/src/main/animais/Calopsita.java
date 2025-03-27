package main.animais;

public class Calopsita extends Passaro {
    private String som;
    public Calopsita(String nome, String corPena, String som) {
        super(nome, corPena);
        this.som = som;
    }

    @Override
    public String fazerSom() {
        return this.som;
    }
}
