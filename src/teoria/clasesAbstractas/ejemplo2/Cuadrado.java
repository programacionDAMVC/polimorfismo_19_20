package teoria.clasesAbstractas.ejemplo2;

public class Cuadrado extends FiguraRegular {
    public Cuadrado( double longitudLado) {
        super(4, longitudLado);
    }

    @Override
    public double calcularArea() {
        return longitudLado * longitudLado;
    }
}
