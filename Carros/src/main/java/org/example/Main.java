package org.example;

import org.example.model.Carro;
import org.example.model.SUV;
import org.example.model.SW4;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new SW4(180f, true);

        Carro carro2 = new SW4(500f, false);

        System.out.println(carro1);
        System.out.println(carro2);

        ((SUV)carro1).alterarLugares();

        System.out.println(carro1);
    }
}