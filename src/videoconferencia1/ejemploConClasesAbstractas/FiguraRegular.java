package videoconferencia1.ejemploConClasesAbstractas;

public abstract class FiguraRegular {
    private int numeroLados;
    protected double longitudLado;

    public FiguraRegular(int numeroLados, double longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }
    public double calcularPerimetro(){
        return numeroLados * longitudLado;
    }

    public abstract double calcularArea();

    public abstract  String referenciarFigura();
    @Override
    public String toString() {
        return String.format("Figura regular de %d lados, longitud de lado %.2f y perímetro %.2f",
                numeroLados, longitudLado, calcularPerimetro());
    }
}
