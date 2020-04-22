package teoria.clasesAbstractas.ejemplo1;

public class TestFigurasRegulares {
    public static void main(String[] args) {
        FiguraRegular cuadrado = new Cuadrado(5.3);
        mostrarPerimetroArea(cuadrado);
        FiguraRegular trianguloEquilatero = new TrianguloEquilatero(5.3);
        mostrarPerimetroArea(trianguloEquilatero);

    }
    public static void mostrarPerimetroArea(FiguraRegular figuraRegular){
        System.out.printf("El perimetro vale %.2f%n", figuraRegular.calcularPerimetro());
        if (figuraRegular instanceof Cuadrado) {
            Cuadrado cuadrado = (Cuadrado) figuraRegular;
            System.out.printf("El área vale %.2f%n", cuadrado.calcularArea());
        }
        if (figuraRegular instanceof TrianguloEquilatero){
            TrianguloEquilatero trianguloEquilatero = (TrianguloEquilatero) figuraRegular;
            System.out.printf("El área vale %.2f%n", trianguloEquilatero.calcularArea());

        }

    }
}
