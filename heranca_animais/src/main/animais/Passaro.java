package main.animais;

public abstract class Passaro extends Animal{

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

    public abstract void voar();

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nCor Pena: " + getCorPena() +
                "\n Som: " + fazerSom() +
                "\nTipo de Ave: " + this.getClass().getSimpleName();
    }
}
