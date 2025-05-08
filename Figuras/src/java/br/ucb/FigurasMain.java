package src.java.br.ucb;

import src.java.br.ucb.figuras.Figura;
import src.java.br.ucb.figuras.Quadrilatero;
import src.java.br.ucb.figuras.Triangulo;

public class FigurasMain {
    public static void main(String[] args) {
        Figura quad =  new Quadrilatero(3, 4);
        Triangulo triangulo = new Triangulo(3, 3, 4);
        exibir(quad);
        exibir(triangulo);
        System.out.println("Área: " + triangulo.calcularArea(2F,
                                        (float) Math.sqrt(5)));
    }

    public static void exibir(Figura figura) {
        System.out.println("Figura: " + figura.getClass().getSimpleName());
        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Perímetro: " + figura.calcularPerimetro());
    }
}
