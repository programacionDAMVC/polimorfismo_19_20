package interfaces.interfaces1;

public interface FiguraGeometrica {

    double PI = 3.14;
    double calcularArea();
    double calcularPerimetro();
    String getNombreFigura();

    default void nombrarFigura(){
       /* return String.format("%S, %.2f de área y perímetro %.2f%n",
                getNombreFigura(), calcularArea(), calcularPerimetro());*/
       System.out.printf("%S, %.2f de área y perímetro %.2f%n",
               getNombreFigura(), calcularArea(), calcularPerimetro());
    }

}
