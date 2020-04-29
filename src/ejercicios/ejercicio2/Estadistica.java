package ejercicios.ejercicio2;

public interface Estadistica {

    double obtenerValorMinimo();
    double obtenerValorMaximo();
    double obtenerSuma();

    default void mostrarConsola() {
        System.out.printf("Colección de valores reales, con un valor máximo de %.2f, y valor mínimo de %.2f," +
                " y suma de los valores %.2f%n", obtenerValorMaximo(), obtenerValorMinimo(), obtenerSuma());
    }

    static double obtenerValorMedio(double[] valores) {
        double suma = 0;
        for (double valor: valores) {
            suma += valor;
        }
        return suma / valores.length;
    }

}
