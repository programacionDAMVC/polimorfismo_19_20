package teoria.clasesAbstractas.ejemplo1;

public class Cuadrado extends FiguraRegular {
    public Cuadrado(double longitudLado) {
        super(4, longitudLado);
    }
    public double calcularArea(){
        return  longitudLado * longitudLado;
    }
}
