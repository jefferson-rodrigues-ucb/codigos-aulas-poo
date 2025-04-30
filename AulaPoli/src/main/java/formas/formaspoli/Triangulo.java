package formas.formaspoli;

public class Triangulo extends Forma {
    float x, y, z;
    public Triangulo(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public float area() {
        float sp = perimetro() / 2;
        return (float) Math.sqrt(sp*(sp-x)*(sp-y)*(sp-z));
    }
    
    public float area(float base, float altura) {
        return base * altura;
    }

    @Override
    public float perimetro() {
        return x + y + z;
    }
}
