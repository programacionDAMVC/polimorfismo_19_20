package interfaces.interfaces1;

public class Elipse extends FiguraCircular {
    public Elipse(double semieje1, double semieje2) {
        super(semieje1, semieje2, "Elipse");
    }

    @Override
    public double calcularArea() {
        return PI * (semieje1 + semieje2);
    }
}
