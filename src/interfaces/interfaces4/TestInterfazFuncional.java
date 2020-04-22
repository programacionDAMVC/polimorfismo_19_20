package interfaces.interfaces4;

public class TestInterfazFuncional {
    public static void main(String[] args) {
        OperacionAritmetica suma = (x,y) -> x + y;
        OperacionAritmetica multiplicacion = (x,y) -> x * y;

        double sumaValores = suma.operacionAritmetica(3,7);
        double multiplicarValores = multiplicacion.operacionAritmetica(3,7);
        System.out.printf("Multiplicacion %.2f y Suma %.2f%n", multiplicarValores, sumaValores);

    }
}
