package src.java.br.ucb.figuras;

public class Triangulo extends Figura {
    private float x, y, z;

    public Triangulo(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public float calcularArea() {
        float sp = calcularPerimetro() / 2;
        return (float) Math.sqrt(sp * (sp -x) * (sp - y) * (sp - z))/2;
    }

    @Override
    public float calcularPerimetro() {
        return x +  y + z;
    }

    public float calcularArea(float b, float h) {
        return (b * h) / 2;
    }
}
