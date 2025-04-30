package formas.formaspoli;

public class Quadrado extends Forma {
    
    float x;
    
    public Quadrado(float x) {
        this.x = x;
    }

    @Override
    public float area() {
        return x * x;
    }

    @Override
    public float perimetro() {
        return 4 * x;
    }
    
}
