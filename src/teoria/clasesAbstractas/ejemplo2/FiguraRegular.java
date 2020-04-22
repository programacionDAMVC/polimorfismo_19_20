package teoria.clasesAbstractas.ejemplo2;

public abstract class FiguraRegular {
    private int numeroLado;
    protected double longitudLado;

    public FiguraRegular(int numeroLado, double longitudLado) {
        this.numeroLado = numeroLado;
        this.longitudLado = longitudLado;
    }
    public double calcularPerimetro(){
        return numeroLado * longitudLado;
    }
    public abstract double calcularArea();
}
