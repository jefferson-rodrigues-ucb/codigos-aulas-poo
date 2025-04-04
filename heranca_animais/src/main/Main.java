package main;

import main.animais.Calopsita;
import main.animais.Pardal;
import main.estruturas.Casa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calopsita cap1 = new Calopsita("Chico", "Bege", "Puruuu");
        Pardal par1 = new Pardal("João");

        System.out.println("Nome da Calopsita: " + cap1.getNome());
        System.out.println("Cor da Calopsita: " + cap1.getCorPena());
        System.out.println("Som que o " + cap1.getNome() + " faz: " +
                cap1.fazerSom());

        System.out.println("Nome do Pardal: " + par1.getNome());
        System.out.println("Cor do Pardal: " + par1.getCorPena());
        System.out.println("Som que o " + par1.getNome() + " faz: " +
                par1.fazerSom());

        Scanner sc = new Scanner(System.in);
        String nomeP2, corPenaP2, somP2;
        System.out.println("Qual o nome da calopsita? ");
        nomeP2 = sc.nextLine();
        System.out.println("Qual a cor da  calopsita? ");
        corPenaP2 = sc.nextLine();
        System.out.println("Qual som a calopsita emite? ");
        somP2 = sc.nextLine();
        Calopsita cap2 = new Calopsita(nomeP2, corPenaP2, somP2);

        System.out.println("Nome da Calopsita: " + cap2.getNome());
        System.out.println("Cor da Calopsita: " + cap2.getCorPena());
        System.out.println("Som que o " + cap2.getNome() + " faz: " +
                cap2.fazerSom());

        Casa casa = new  Casa();
        casa.adicionarAnimal(cap1);
        casa.adicionarAnimal(cap2);
        //casa.adicionarAnimal(par1);
        casa.mostrarAnimais();
    }
}