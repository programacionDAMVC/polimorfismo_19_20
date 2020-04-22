package interfaces.interfaces1;

import java.util.ArrayList;
import java.util.List;

public class TestFigurasGeometricas {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new Cuadrado(3.2);
        FiguraGeometrica rectangulo = new Rectangulo(3.1, 3.3);
        FiguraGeometrica circulo = new Circulo(3.6);
        FiguraGeometrica elipse = new Elipse(3.1, 3.3);
        List<FiguraGeometrica> lista = new ArrayList<>();
        lista.add(cuadrado);
        lista.add(rectangulo);
        lista.add(circulo);
        lista.add(elipse);
        mostrarFigurasGeometricas(lista);
    }

    private static void mostrarFigurasGeometricas(List<FiguraGeometrica> lista) {
       /* for (FiguraGeometrica figuraGeometria: lista) {
            System.out.println(figuraGeometria.nombrarFigura());
        }*/
       lista.forEach(FiguraGeometrica::nombrarFigura);
    }
}
