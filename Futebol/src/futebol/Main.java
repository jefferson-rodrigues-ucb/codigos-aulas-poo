package futebol;

import futebol.instituicao.TimeFutebol;
import futebol.rh.Jogador;

public class Main {
    public static void main(String[] args) {
        TimeFutebol flamengo = new TimeFutebol("Flamengo", "Vermelho/Preto");
        flamengo.setMascote("Urubu");
        flamengo.setEstadio("\"Maracanã\"");

        Jogador jogador1 = new Jogador("Bruno", 1, "GL");
        Jogador jogador2 = new Jogador("Arrascaeta", 10, "MEI");

        flamengo.adicionarJogador(jogador1);
        flamengo.adicionarJogador(jogador2);

        System.out.println("Primeiro time: " + flamengo);

        System.out.println("Jogadores:");
        System.out.println(flamengo.getJogador(1));
        System.out.println(flamengo.getJogador(10));

    }
}