package ejercicios.ejercicio2;

import java.util.Arrays;

public class ArrayReales implements Estadistica {
    private double[] valores;

    public ArrayReales(double[] valores) {
        this.valores = valores;
        Arrays.sort(valores);  //implica que el orden de insercción se pierde
    }

    public double[] getValores() {
        return valores;
    }

    @Override
    public double obtenerValorMinimo() {
        return valores[0];
    }

    @Override
    public double obtenerValorMaximo() {
        return valores[valores.length - 1];
    }

    @Override
    public double obtenerSuma() {
        double suma = 0;
        for (double valor: valores) {
            suma += valor;
        }
        return suma;
    }
}
