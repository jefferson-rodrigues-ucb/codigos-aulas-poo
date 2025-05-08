package src.java.br.ucb.figuras;

public class Quadrilatero extends Figura{
    private float x, y;
    public Quadrilatero(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public float calcularArea() {
        return x * y;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * x + 2 * y;
    }
}
