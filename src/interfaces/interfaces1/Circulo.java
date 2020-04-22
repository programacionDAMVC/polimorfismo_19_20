package interfaces.interfaces1;

public class Circulo extends FiguraCircular{
    public Circulo(double radio) {
        super(radio, radio, "Círculo");
    }

    @Override
    public double calcularArea() {
        return PI * semieje1 * semieje2;
    }
}
