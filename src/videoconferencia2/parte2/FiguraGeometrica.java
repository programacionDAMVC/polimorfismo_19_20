package videoconferencia2.parte2;

public interface FiguraGeometrica {
    double PI = Math.PI;
    double calcularPerimetro();
    double calcularArea();
    String nombreFigura();

    default void mostrarDatosFigura () {
        System.out.printf("Figura %s, área %.2f y perímetro %.2f%n", nombreFigura(), calcularArea(), calcularPerimetro());
    }
}
