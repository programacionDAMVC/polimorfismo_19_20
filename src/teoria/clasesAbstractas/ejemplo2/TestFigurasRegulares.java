package teoria.clasesAbstractas.ejemplo2;

public class TestFigurasRegulares {
    public static void main(String[] args) {
        FiguraRegular cuadrado = new Cuadrado(5.3);
        mostrarPerimetroArea(cuadrado);
        FiguraRegular trianguloEquilatero = new TrianguloEquilatero(5.3);
        mostrarPerimetroArea(trianguloEquilatero);
    }

    private static void mostrarPerimetroArea(FiguraRegular figuraRegular) {
        System.out.printf("El perimetro vale %.2f%n", figuraRegular.calcularPerimetro());
        System.out.printf("El área vale %.2f%n", figuraRegular.calcularArea());

    }
}
