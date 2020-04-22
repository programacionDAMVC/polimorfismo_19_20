package videoconferencia1.ejemploSinClasesAbstractas;

public class TestFiguraRegular {
    public static void main(String[] args) {
        FiguraRegular cuadrado = new Cuadrado(4.7);
        FiguraRegular trianguloEquilatero = new TrianguloEquilatero(4.7);
        mostrarFigurasRegulares(cuadrado);
        mostrarFigurasRegulares(trianguloEquilatero);

    }

    private static void mostrarFigurasRegulares(FiguraRegular figuraRegular) {

        System.out.printf("Perímetro de la figura %.2f%n", figuraRegular.calcularPerimetro());
        if (figuraRegular instanceof Cuadrado) {
            Cuadrado cuadrado = (Cuadrado) figuraRegular;
            System.out.printf("Área de la figura %.2f%n", cuadrado.calcularArea());

        }
        if (figuraRegular instanceof TrianguloEquilatero) {
           TrianguloEquilatero trianguloEquilatero = (TrianguloEquilatero) figuraRegular;
            System.out.printf("Área de la figura %.2f%n", trianguloEquilatero.calcularArea());
        }

    }
}
