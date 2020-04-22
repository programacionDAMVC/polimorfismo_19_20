package videoconferencia1.ejemploSinClasesAbstractas;

public class Cuadrado extends FiguraRegular {
    public Cuadrado( double longitudLado) {
        super(4, longitudLado);
    }
    public double calcularArea() {
        return longitudLado * longitudLado;
    }
    @Override
    public String toString() {
        return String.format("%s y área %.2f%n",super.toString(), calcularArea());
    }
}
