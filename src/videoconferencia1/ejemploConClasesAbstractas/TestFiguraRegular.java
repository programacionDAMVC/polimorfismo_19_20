package videoconferencia1.ejemploConClasesAbstractas;


public class TestFiguraRegular {
    public static void main(String[] args) {
        FiguraRegular cuadrado = new Cuadrado(4.7);
        FiguraRegular trianguloEquilatero = new TrianguloEquilatero(4.7);
        System.out.println(cuadrado.referenciarFigura());
        mostrarFigurasRegulares(cuadrado);
        System.out.println(trianguloEquilatero.referenciarFigura());
        mostrarFigurasRegulares(trianguloEquilatero);

    }

    private static void mostrarFigurasRegulares(FiguraRegular figuraRegular) {
        System.out.printf("Perímetro de la figura %.2f%n", figuraRegular.calcularPerimetro());
        System.out.printf("Área de la figura %.2f%n", figuraRegular.calcularArea());
    }
}

