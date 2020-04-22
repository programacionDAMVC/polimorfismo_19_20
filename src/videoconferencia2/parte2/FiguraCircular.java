package videoconferencia2.parte2;

public abstract class FiguraCircular implements FiguraGeometrica {
    private double semiejeMayor;
    private double semiejeMenor;
    private String nombre;

    public FiguraCircular(double semiejeMayor, double semiejeMenor, String nombre) {
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
        this.nombre = nombre;
    }

    @Override
    public double calcularPerimetro() {
        return FiguraGeometrica.PI * (semiejeMayor + semiejeMenor);
    }

    @Override
    public double calcularArea() {
        return FiguraGeometrica.PI * semiejeMenor * semiejeMayor;
    }

    @Override
    public abstract String nombreFigura() ;
}
