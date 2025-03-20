package futebol.rh;

public class Jogador {
    private String nome;
    private int numeroCamisa;
    private String posicao;

    public Jogador(String nome, int numeroCamisa, String posicao) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String toString() {
        return "Nome do Jogador: " + nome +
                "\nNúmero da Camisa: " + numeroCamisa +
                "\nJoga na Posição: " + posicao;
    }
}
