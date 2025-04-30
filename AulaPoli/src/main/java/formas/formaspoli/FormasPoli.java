package formas.formaspoli;

public class FormasPoli {

    public static void main(String[] args) {
        Forma a = new Quadrado(2);
        Triangulo b = new Triangulo(4,3,3);
        
        imprimir(a);
        imprimir(b);
        System.out.println("Área bh: " +
                b.area(2, (float) Math.sqrt(5)));
    }
    
    private static void imprimir(Forma f) {
        System.out.println("Tipo de Figura: " + f.getClass());
        System.out.println("Área: " + f.area());
        System.out.println("Perímetro: " + f.perimetro());
    }
}
