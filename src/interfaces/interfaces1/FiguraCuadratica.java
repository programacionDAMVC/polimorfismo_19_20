package interfaces.interfaces1;

public class FiguraCuadratica implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private String nombre;

    public FiguraCuadratica(double lado1, double lado2, String nombre) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.nombre = nombre;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 *2 + lado2 +2;
    }

    @Override
    public String getNombreFigura() {
        return this.nombre;
    }
}
