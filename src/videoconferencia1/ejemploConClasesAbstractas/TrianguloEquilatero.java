package videoconferencia1.ejemploConClasesAbstractas;

public class TrianguloEquilatero extends FiguraRegular{
    public TrianguloEquilatero(double longitudLado) {
        super(3, longitudLado);
    }

    @Override
    public double calcularArea() {
        return Math.sqrt(3) / 4 * super.longitudLado * super.longitudLado;
    }
    @Override
    public String referenciarFigura() {
        return String.format("Soy un triángulo de lado %.2f", super.longitudLado);
    }
}
