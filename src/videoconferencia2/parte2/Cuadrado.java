package videoconferencia2.parte2;

public class Cuadrado extends FiguraCuadratica {
    public Cuadrado(double lado) {
        super(lado, lado, "Cuadrado");
    }

    @Override
    public String nombreFigura() {
        return "CUADRADO";
    }
}
