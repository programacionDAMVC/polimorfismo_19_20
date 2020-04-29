package ejercicios.ejercicio2;

import java.util.Arrays;

public class TestEjercicioArray {
    private static int TAMANNO = 100;
    private static double VALOR_MAXIMO = 1_000;
    public static void main(String[] args) {
        double[] valores = obtenerColeccionAleatoria();
        ArrayReales arrayReales = new ArrayReales(valores);
        System.out.println(Arrays.toString(arrayReales.getValores()));
        System.out.printf("Valor máximo de la colección %.2f%n", arrayReales.obtenerValorMaximo());
        System.out.printf("Valor mínimo de la colección %.2f%n", arrayReales.obtenerValorMinimo());
        System.out.printf("Suma de la colección %.2f%n", arrayReales.obtenerSuma());
        System.out.printf("Valor medio de la colección %.2f%n", Estadistica.obtenerValorMedio(arrayReales.getValores()));
        arrayReales.mostrarConsola();


    }

    private static double[] obtenerColeccionAleatoria() {
        double[] valores = new double[TAMANNO];
        for (int i = 0; i < TAMANNO; i++) {
            valores[i] = Math.random() * VALOR_MAXIMO;
        }
        return valores;
    }
}
