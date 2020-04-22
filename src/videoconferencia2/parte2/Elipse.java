package videoconferencia2.parte2;

public class Elipse extends FiguraCircular {
    public Elipse(double semiejeMayor, double semiejeMenor) {
        super(semiejeMayor, semiejeMenor, "elipse");
    }

    @Override
    public String nombreFigura() {
        return "ELIPSE";
    }
}
