package videoconferencia1.ejemploSinClasesAbstractas;

public class FiguraRegular {
    private int numeroLados;
    protected double longitudLado;

    public FiguraRegular(int numeroLados, double longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }
    public double calcularPerimetro(){
        return numeroLados * longitudLado;
    }

    @Override
    public String toString() {
        return String.format("Figura regular de %d lados, longitud de lado %.2f y perímetro %.2f",
                numeroLados, longitudLado, calcularPerimetro());
    }
}
