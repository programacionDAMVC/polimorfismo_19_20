package videoconferencia1.ejemploSinClasesAbstractas;

public class TrianguloEquilatero extends FiguraRegular {
    public TrianguloEquilatero( double longitudLado ) {
        super(3, longitudLado);
    }

    public double calcularArea() {
        return Math.sqrt(3) / 4 * super.longitudLado * super.longitudLado;
    }

    @Override
    public String toString() {
        return String.format("%s y área %.2f%n",super.toString(), calcularArea());
    }
}
