package videoconferencia2.parte2;

public class Rectangulo extends FiguraCuadratica {
    public Rectangulo(double lado1, double lado2) {
        super(lado1, lado2, "Rectangulo");
    }

    @Override
    public String nombreFigura() {
        return "RECTÁNGULO";
    }
}
