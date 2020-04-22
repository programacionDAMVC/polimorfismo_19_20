package videoconferencia2.parte2;

public class Circulo extends FiguraCircular {
    public Circulo(double radio) {
        super(radio, radio, "círculo");
    }

    @Override
    public String nombreFigura() {
        return "CIRCULO";
    }
}
