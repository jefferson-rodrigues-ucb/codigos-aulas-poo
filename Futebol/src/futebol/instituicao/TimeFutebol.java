package futebol.instituicao;

import futebol.rh.Jogador;

public class TimeFutebol {
    private String nome;
    private String cores;
    private String mascote;
    private String estadio;
    private Jogador jogadores[];

    public TimeFutebol(String nome, String cores) {
        this.nome = nome;
        this.cores = cores;
        jogadores = new Jogador[100];
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores[jogador.getNumeroCamisa()] = jogador;
    }

    public Jogador getJogador(int numeroCamisa) {
        return jogadores[numeroCamisa];
    }

    public String getNome() {
        return nome;
    }


    public String getCores() {
        return cores;
    }

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
}
