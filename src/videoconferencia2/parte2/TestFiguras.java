package videoconferencia2.parte2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestFiguras {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new Cuadrado(3.3);
        FiguraGeometrica rectangulo = new Rectangulo(3.3, 6.8);
        FiguraGeometrica circulo = new Circulo(6.2);
        FiguraGeometrica elipse = new Elipse(2.3, 1.7);
        Set<FiguraGeometrica> conjunto = new HashSet<>();
        conjunto.add(cuadrado);
        conjunto.add(circulo);
        conjunto.add(elipse);
        conjunto.add(rectangulo);
        for (FiguraGeometrica figuraGeometrica: conjunto) {
            figuraGeometrica.mostrarDatosFigura();
        }
        conjunto.forEach(FiguraGeometrica::mostrarDatosFigura);
    }
}
