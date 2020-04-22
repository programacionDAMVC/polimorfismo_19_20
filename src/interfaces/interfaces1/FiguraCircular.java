package interfaces.interfaces1;

public abstract class FiguraCircular implements FiguraGeometrica{
    protected double semieje1;
    protected double semieje2;
    private String nombre;

    public FiguraCircular(double semieje1, double semieje2, String nombre) {
        this.semieje1 = semieje1;
        this.semieje2 = semieje2;
        this.nombre = nombre;
    }

    @Override
    public abstract double calcularArea();

    @Override
    public double calcularPerimetro() {
        return PI * semieje1 * semieje2;
    }

    @Override
    public String getNombreFigura() {
        return this.nombre;
    }
}
