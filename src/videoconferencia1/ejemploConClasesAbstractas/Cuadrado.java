package videoconferencia1.ejemploConClasesAbstractas;

public class Cuadrado extends FiguraRegular {
    public Cuadrado( double longitudLado) {
        super(4, longitudLado);
    }
    @Override
    public double calcularArea() {
        return longitudLado * longitudLado;
    }

    @Override
    public String referenciarFigura() {
        return String.format("Soy un cuadrado de lado %.2f", super.longitudLado);
    }

    @Override
    public String toString() {
        return String.format("%s y área %.2f%n",super.toString(), calcularArea());
    }
}