package teoria.clasesAbstractas.ejemplo2;

public class TrianguloEquilatero extends FiguraRegular{

        public TrianguloEquilatero(double longitudLado) {
            super(3, longitudLado);
        }

    @Override
    public double calcularArea() {
        return Math.sqrt(3) / 4 * longitudLado * longitudLado;
    }
}
